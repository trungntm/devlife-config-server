package com.trungntm.app.validator;

import com.trungntm.domain.entity.Property;
import com.trungntm.infrastructure.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropertyValidator {

    @Autowired
    private PropertyRepository repo;

    public boolean isExist(Property property) {
        return repo.findByApplicationAndKeyAndProfileAndLabel(property.getApplication(), property.getKey(), property.getProfile(), property.getLabel()).isPresent();
    }
}
