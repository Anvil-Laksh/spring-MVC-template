package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
@Data
@AllArgsConstructor
public class Customer implements Serializable {
    private int ID;
    private String Name;
    private String City;

}
