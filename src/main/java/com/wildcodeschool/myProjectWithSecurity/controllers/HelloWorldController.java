package com.wildcodeschool.myProjectWithSecurity.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String champion() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public List <String> director(ArrayList<Integer> List) {
        ArrayList <String> school = new ArrayList <String>();
        school.add("Reims");
        school.add("Strasbourg");
        school.add("Paris");
        school.add("La loupe");
        school.add("Bordeaux");
        school.add("Lille");
        return school;
    }
}