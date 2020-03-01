package com.example.demo.controller;

import com.example.demo.dto.Customer;
import com.example.demo.service.TestService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@Slf4j
@RequestMapping("/index")
public class TestControllers<Sl4j> {
    @Autowired
    private TestService testService;
    @GetMapping("/index")
    public Customer getControl(){
        log.info("Inside Controller");
        return testService.getHelloworld();
    }

}
