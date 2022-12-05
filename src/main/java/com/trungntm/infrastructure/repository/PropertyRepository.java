package com.trungntm.infrastructure.repository;

import com.trungntm.domain.entity.Profile;
import com.trungntm.domain.entity.Property;
import com.vladmihalcea.spring.repository.HibernateRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@JaversSpringDataAuditable
public interface PropertyRepository extends HibernateRepository<Property>, JpaRepository<Property, Long> {

    Optional<Property> findByApplicationAndKeyAndProfileAndLabel(String application, String key, Profile profile, String label);
}
