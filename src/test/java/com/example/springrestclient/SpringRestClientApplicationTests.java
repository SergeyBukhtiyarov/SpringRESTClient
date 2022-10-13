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

        Employee employee = communication.getEmployee(4);
        System.out.println(employee);


        Employee employee1 = new Employee();
        employee1.setName("Sveta");
        employee1.setSurname("Rodina");
        employee1.setDepartment("IT");
        employee1.setSalary(54321);
        employee1.setId(10);

        communication.saveEmployee(employee1);

        communication.deleteEmployee(10);

    }

}
