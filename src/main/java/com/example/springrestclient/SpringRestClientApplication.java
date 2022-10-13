package com.example.springrestclient;


import com.example.springrestclient.entity.Employee;
import com.example.springrestclient.service.Communication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class SpringRestClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringRestClientApplication.class, args);



    }
}
