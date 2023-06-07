package com.butterfly.volunt.controller;

import com.butterfly.volunt.service.UserService;
import com.butterfly.volunt.model.UserValidation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class UserController  {

    private final UserService userService;

    @GetMapping("/user/validateCredentials")
    public ResponseEntity<Object> validateCredentials(@RequestParam("username") String username, @RequestParam("password") String password) {
            return new ResponseEntity<>(new UserValidation(userService.validateUsernamePasswordExists(username, password)), HttpStatus.OK);
    }

    @GetMapping("/user/listAll")
    public ResponseEntity<Object> listAll() {
        return new ResponseEntity<>(userService.listAll(), HttpStatus.OK);
    }
}
