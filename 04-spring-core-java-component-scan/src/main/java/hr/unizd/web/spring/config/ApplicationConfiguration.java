package hr.unizd.web.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "hr.unizd.web.spring")
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {

}
