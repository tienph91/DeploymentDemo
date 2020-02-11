package com.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/location")
public class TestController {

    @GetMapping("/all")
    public ResponseEntity<Object> findLocationById() {
        ResponseEntity<Object> object = new ResponseEntity<Object>(400, HttpStatus.OK);
        return object;
    }
}
