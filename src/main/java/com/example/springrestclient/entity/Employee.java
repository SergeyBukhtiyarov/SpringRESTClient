package com.example.springrestclient.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data

public class Employee {


    private int id;
    private String name;
    private String surname;
    private String department;
    private int salary;

}
