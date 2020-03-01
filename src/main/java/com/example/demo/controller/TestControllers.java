package com.example.demo.controller;

import com.example.demo.dto.Customer;
import com.example.demo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/edu")
@Slf4j
public class TestControllers {
    @Autowired
    private TestService testService;
    @GetMapping("/get")
    public Customer getControl(){
        log.info("Inside Controller");
        return testService.getHelloworld();
    }

}
