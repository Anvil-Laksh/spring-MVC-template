package com.example.demo.repo;

import com.example.demo.dto.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class TestRepo {

    private List<Customer> customers;

        public TestRepo(){
            customers = new ArrayList<>();
        }

        public List<Customer> getCustomer(){
            return customers;
        }

        public void addCustomer(Customer customer){
            customers.add(customer);
        }

        public void delCustomer(Customer customer){
            customers.remove(customer);
        }
}
