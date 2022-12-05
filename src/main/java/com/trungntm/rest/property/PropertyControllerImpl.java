package com.trungntm.rest.property;

import com.trungntm.app.service.property.PropertyService;
import com.trungntm.domain.entity.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(PropertyController.API_PATH)
public class PropertyControllerImpl implements PropertyController {

    @Autowired
    private PropertyService service;

    @Override
    public PropertyDTO create(@Valid @RequestBody PropertyDTO body) {
        Property propertyCreated = service.create(body);
        return service.getConverter().toDTO(propertyCreated);
    }

    @Override
    public PropertyDTO update(PropertyDTO body) {
        Property propertyUpdated = service.update(body);
        return service.getConverter().toDTO(propertyUpdated);
    }
}
