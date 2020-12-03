package com.example.demo.service.impl;

import com.example.demo.config.DefaultPropertiesConfig;
import com.example.demo.config.DefaultYamlConfig;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * @author Fiuty
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DefaultPropertiesConfig defaultConfig;

    @Autowired
    private Environment environment;

    @Autowired
    private DefaultYamlConfig defaultYamlConfig;

    @Value("${default.student.name}")
    private String name;

    @Value("${default.student.age}")
    private int age;


    @Override
    public String properties1() {
        return defaultConfig.getName() + ":" + defaultConfig.getAge();
    }

    @Override
    public String properties2() {
        return environment.getProperty("name")+":"+environment.getProperty("age");
    }

    @Override
    public String properties3() {
        return defaultYamlConfig.getName() + ":" + defaultYamlConfig.getAge();
    }

    @Override
    public String properties4() {
        return name + ":" + age;
    }
}
