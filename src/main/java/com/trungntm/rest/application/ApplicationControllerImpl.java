package com.trungntm.rest.application;

import com.trungntm.app.service.application.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ApplicationController.API_PATH)
public class ApplicationControllerImpl implements ApplicationController {

    @Autowired
    private ApplicationService service;

    @Override
    public List<String> getApplications() {
        return service.getApplications();
    }
}
