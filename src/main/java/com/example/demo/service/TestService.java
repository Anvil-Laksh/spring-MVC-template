package com.example.demo.service;

import com.example.demo.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {

    public Customer getHelloworld(){
        log.info("inside get Mapping");
        return new Customer(1,"sumi","Mumbai");
    }
}


//lombok
//slf4j
//sonarlint
//