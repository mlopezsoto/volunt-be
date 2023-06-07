package com.butterfly.volunt.service;

import com.butterfly.volunt.entity.User;

import java.util.List;

public interface UserService {

    boolean validateUsernamePasswordExists(String username, String password);

    boolean validateUsernameExists(String username);

    List<User> listAll();
}
