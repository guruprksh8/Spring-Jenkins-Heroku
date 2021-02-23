package com.guruPrakash.SpringJenkinsHeroku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

    String name="Guru";

    @GetMapping("/")
    public String startUp(){
        return "hello "+name;
    }
}
