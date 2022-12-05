package com.trungntm.rest.application;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ApplicationController {

    String API_PATH = "/api/v1/app";

    @GetMapping("")
    List<String> getApplications();

}
