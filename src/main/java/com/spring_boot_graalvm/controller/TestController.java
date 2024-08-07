package com.spring_boot_graalvm.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping (value = "")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello World");
    }

}
