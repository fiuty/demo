package com.example.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Fiuty
 */
@Configuration
@PropertySource(value = {"default.properties"})
@Data
public class DefaultPropertiesConfig {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;


}
