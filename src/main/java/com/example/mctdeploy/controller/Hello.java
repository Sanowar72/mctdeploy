package com.example.mctdeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping(value = "/home")
    public String home(){
        return "this is mct home deploy.... latest";
    }

}
