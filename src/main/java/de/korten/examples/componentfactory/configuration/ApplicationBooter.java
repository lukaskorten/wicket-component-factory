package de.korten.examples.componentfactory.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("de.korten.examples.componentfactory")
public class ApplicationBooter {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBooter.class, args);
    }

}
