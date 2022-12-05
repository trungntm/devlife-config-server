package com.trungntm.app.service.javers;

public interface PropertyAuditService {

    String getSnapshot();

    String getChanges();

    String getShadows();
}
