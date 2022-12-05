package com.trungntm.rest.javers;

import org.springframework.web.bind.annotation.GetMapping;

public interface PropertyAuditController {

    String API_PATH = "/api/v1/property-audit";

    @GetMapping("/snapshot")
    String getSnapshot();

    @GetMapping("/changes")
    String getChanges();

    @GetMapping("/shadows")
    String getShadows();
}
