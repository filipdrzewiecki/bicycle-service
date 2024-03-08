package com.bicycle.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bicycles")
@RequiredArgsConstructor
public class BicycleController {

    @GetMapping
    public String getBicycles() {
        return "Hello world";
    }
}
