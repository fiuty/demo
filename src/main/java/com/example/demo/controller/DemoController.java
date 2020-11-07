package com.example.demo.controller;

import com.example.demo.service.DemoService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fiuty
 */
@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/properties1")
    public String properties1() {
        return demoService.properties1();
    }

    @GetMapping("/properties2")
    public String properties2() {
        return demoService.properties2();
    }

    @GetMapping("/properties3")
    public String properties3() {
        return demoService.properties3();
    }
}
