package com.trungntm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        basePackages = {
                "com.vladmihalcea.spring.repository",
                "com.trungntm.infrastructure.repository"
        }
)
public class JpaConfig {
}
