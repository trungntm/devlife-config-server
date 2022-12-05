package com.trungntm.rest.javers;

import com.trungntm.app.service.javers.PropertyAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(PropertyAuditController.API_PATH)
public class PropertyAuditControllerImpl implements PropertyAuditController {

    @Autowired
    private PropertyAuditService service;

    @Override
    public String getSnapshot() {
        return service.getSnapshot();
    }

    @Override
    public String getChanges() {
        return service.getChanges();
    }

    @Override
    public String getShadows() {
        return service.getShadows();
    }
}
