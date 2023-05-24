package com.butterfly.volunt.controller;

import com.butterfly.volunt.api.UserApi;
import com.butterfly.volunt.model.UserValidation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@CrossOrigin
public class UserController implements UserApi {


    @Override
    public ResponseEntity<Object> validateCredentials(Object username, Object password) {

        if (Objects.isNull(username) || username.toString().isEmpty()) {
            return new ResponseEntity<>(new UserValidation(false), HttpStatus.OK);
        }

        if (Objects.isNull(password) || password.toString().isEmpty()) {
            return new ResponseEntity<>(new UserValidation(false), HttpStatus.OK);
        }

        if("invalid".equals(username)) {
            return new ResponseEntity<>(new UserValidation(false), HttpStatus.OK);
        }

        return new ResponseEntity<>(new UserValidation(true), HttpStatus.OK);
    }
}
