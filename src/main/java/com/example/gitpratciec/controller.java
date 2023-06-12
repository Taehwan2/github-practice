package com.example.gitpratciec;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {
    public String hello(){
        return "To-doApplication";
    }
}
