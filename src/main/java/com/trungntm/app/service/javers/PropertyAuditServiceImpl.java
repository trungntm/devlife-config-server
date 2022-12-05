package com.trungntm.app.service.javers;

import com.trungntm.domain.entity.Property;
import org.javers.core.Changes;
import org.javers.core.Javers;
import org.javers.core.metamodel.object.CdoSnapshot;
import org.javers.repository.jql.QueryBuilder;
import org.javers.shadow.Shadow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyAuditServiceImpl implements PropertyAuditService {

    @Autowired
    private Javers javers;

    @Override
    public String getSnapshot() {
        QueryBuilder jqlQuery = QueryBuilder.byClass(Property.class);
        List<CdoSnapshot> snapshots = javers.findSnapshots(jqlQuery.build());
        return javers.getJsonConverter().toJson(snapshots);
    }

    @Override
    public String getChanges() {
        QueryBuilder jqlQuery = QueryBuilder.byClass(Property.class);
        Changes snapshots = javers.findChanges(jqlQuery.build());
        return javers.getJsonConverter().toJson(snapshots);
    }

    @Override
    public String getShadows() {
        QueryBuilder jqlQuery = QueryBuilder.byClass(Property.class);
        List<Shadow<Object>> snapshots = javers.findShadows(jqlQuery.build());
        return javers.getJsonConverter().toJson(snapshots);
    }
}
