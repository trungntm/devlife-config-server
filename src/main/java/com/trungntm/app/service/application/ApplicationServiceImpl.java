package com.trungntm.app.service.application;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private EurekaClient eurekaClient;

    @Override
    public List<String> getApplications() {

        return eurekaClient.getApplications()
                .getRegisteredApplications()
                .stream()
                .map(app -> app.getName().toLowerCase())
                .toList();
    }
}
