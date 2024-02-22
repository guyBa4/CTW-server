package Application.Configurations;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@org.springframework.context.annotation.Configuration
@EnableJpaRepositories("Application.Repositories")
@ComponentScan(basePackages = {"Application.APILayer", "Application.ServiceLayer", "Application.DataAccessLayer"})
@EntityScan("Application.Entities")
public class Configuration {
}