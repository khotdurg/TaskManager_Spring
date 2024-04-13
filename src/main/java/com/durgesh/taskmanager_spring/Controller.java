package com.durgesh.taskmanager_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    String hello(){
        return "Bharat mata ki jai";
    }
}
