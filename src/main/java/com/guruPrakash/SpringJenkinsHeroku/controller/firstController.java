package com.guruPrakash.SpringJenkinsHeroku.controller;

import com.guruPrakash.SpringJenkinsHeroku.classes.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

    @Autowired
    Person person;

    @GetMapping("/")
    public String startUp(){
        return person.toString();
    }
}
