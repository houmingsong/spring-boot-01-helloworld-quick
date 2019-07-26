package com.lovo.springboot.controller;


import com.lovo.springboot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick!";
    }

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello " + name;
}

}
