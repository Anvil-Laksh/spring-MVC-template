package com.example.demo.service;

import com.example.demo.dto.Customer;
import com.example.demo.repo.TestRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TestService {
    @Autowired
    private TestRepo testRepo;
    public List<Customer> getHelloworld(){
        log.info("inside get Mapping");
        return testRepo.getCustomer();
    }

    public void addCustomerService(Customer customer){
        testRepo.addCustomer(customer);
    }

    public void delCustomerService(Customer customer){
        testRepo.delCustomer(customer);
    }


}


//lombok
//slf4j
//sonarlint
//