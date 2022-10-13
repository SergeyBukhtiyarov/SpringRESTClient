package com.example.springrestclient;

import com.example.springrestclient.entity.Employee;
import com.example.springrestclient.service.Communication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringRestClientApplicationTests {
    @Autowired
    Communication communication;
    @Test
    void contextLoads() {

        List<Employee> employeeList = communication.showAllEmployees();
        System.out.println(employeeList);

    }

}
