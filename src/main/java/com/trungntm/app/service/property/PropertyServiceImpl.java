package com.trungntm.app.service.property;

import com.trungntm.app.converter.property.property.PropertyConverter;
import com.trungntm.app.validator.PropertyValidator;
import com.trungntm.domain.entity.Property;
import com.trungntm.infrastructure.exception.DataNotFoundException;
import com.trungntm.infrastructure.exception.DuplicateRecordException;
import com.trungntm.infrastructure.repository.PropertyRepository;
import com.trungntm.rest.property.PropertyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyConverter converter;

    @Autowired
    private PropertyValidator validator;

    @Autowired
    private PropertyRepository repo;

    @Override
    public Property create(PropertyDTO dto) {
        Property toCreate = converter.toEntity(dto);

        if (!validator.isExist(toCreate)) {
            return repo.persistAndFlush(toCreate);
        } else
            throw new DuplicateRecordException(String.format("Property %s::%s::%s::%s already exist!", dto.getKey(), dto.getProfile(), dto.getApplication(), dto.getLabel()));
    }

    @Override
    public Property update(PropertyDTO dto) {
        Optional<Property> toUpdateOptional = findById(dto.getId());

        if (toUpdateOptional.isEmpty()) {
            throw new DataNotFoundException(String.format("%s::%s does not exist", dto.getKey(), dto.getId()));
        }

        Property toUpdate = converter.toEntity(dto);
        return repo.save(toUpdate);
    }

    @Override
    public Optional<Property> findById(long id) {
        return repo.findById(id);
    }

    @Override
    public PropertyConverter getConverter() {
        return converter;
    }
}
