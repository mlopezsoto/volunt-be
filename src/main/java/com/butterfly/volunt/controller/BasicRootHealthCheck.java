package com.butterfly.volunt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping(path = "/")
public class BasicRootHealthCheck {

    @GetMapping
    public ResponseEntity<Object> healthy() {
        return ResponseEntity.ok("OK");
    }
}

