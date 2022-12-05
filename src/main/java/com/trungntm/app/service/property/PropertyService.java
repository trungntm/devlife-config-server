package com.trungntm.app.service.property;

import com.trungntm.app.converter.property.property.PropertyConverter;
import com.trungntm.domain.entity.Property;
import com.trungntm.rest.property.PropertyDTO;

import java.util.Optional;

public interface PropertyService {

    Property create(PropertyDTO dto);

    Property update(PropertyDTO dto);

    Optional<Property> findById(long id);

    PropertyConverter getConverter();
}
