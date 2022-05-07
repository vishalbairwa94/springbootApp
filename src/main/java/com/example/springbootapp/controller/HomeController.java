package com.example.springbootapp.controller;

import com.example.springbootapp.service.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HelloWorld helloWorld;

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        System.out.println("hello");
        return new ResponseEntity<>(helloWorld.printHello(), HttpStatus.OK);
    }
}
