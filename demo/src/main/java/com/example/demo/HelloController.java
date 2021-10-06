package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * HelloController
 */
@RestController
public class HelloController {

    @GetMapping(value="/")
    public String getHelloWorld() {
        return "Hello JCON World!";
    }
    
}