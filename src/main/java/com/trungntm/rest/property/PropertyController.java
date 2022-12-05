package com.trungntm.rest.property;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public interface PropertyController {

    String API_PATH = "/api/v1/property";


    // Note: These APIs just use for testing Javers, will refactor later if you in charge of this
    @PostMapping
    PropertyDTO create(@Valid @RequestBody PropertyDTO body);

    @PutMapping
    PropertyDTO update(@Valid @RequestBody PropertyDTO body);
}
