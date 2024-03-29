package org.deliveries.api.config.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "org.deliveries.db")
@EnableJpaRepositories(basePackages = "org.deliveries.db")
public class JpaConfig {
}
