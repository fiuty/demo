package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Fiuty
 */
@Configuration
@ConfigurationProperties(prefix = "default.student")
@Data
public class DefaultYamlConfig {

    private String name;

    private Integer age;
}
