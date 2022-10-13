package com.example.springrestclient.service;


import com.example.springrestclient.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {
    @Autowired
    RestTemplate restTemplate;

    private final String URL = "http://localhost:8080/api/employees";

    public List<Employee> showAllEmployees() {
        ResponseEntity<List<Employee>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null
                , new ParameterizedTypeReference<List<Employee>>() {});
        List<Employee> employeeList = responseEntity.getBody();
        return  employeeList;

    }


}
