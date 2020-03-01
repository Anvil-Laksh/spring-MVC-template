package com.example.demo.controller;

import com.example.demo.dto.Customer;
import com.example.demo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/edu")
@Slf4j
public class TestControllers {
    @Autowired
    private TestService testService;
    @GetMapping("/get")
    public List<Customer> getControl(){
        log.info("Inside Controller");
        return testService.getHelloworld();
    }


    @PostMapping("/submit")
    public void addCustomer(@RequestBody Customer customer){
        testService.addCustomerService(customer);
        log.info("add query success");
    }

    @RequestParam(value = "id")
    public void delCustomer(Customer customer){
        testService.delCustomerService(customer);
        log.info("customer del success");
    }
}
