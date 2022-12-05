package com.trungntm.app.converter.property.property;

import com.trungntm.Converter;
import com.trungntm.domain.entity.Property;
import com.trungntm.rest.property.PropertyDTO;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {

    private static final Converter.Instance<PropertyDTO, Property> converter = Converter.getConverter(PropertyDTO.class, Property.class);

    public PropertyDTO toDTO(Property entity) {
        return converter.backwards(entity);
    }

    public Property toEntity(PropertyDTO dto) {
        return converter.convert(dto);
    }
}
