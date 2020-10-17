package com.learn.cxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocxy {
    @GetMapping("/hello")
    public String Hell0(){
        return "Hello,常兴月";
    }

}
