package com.butterfly.volunt.service;

import com.butterfly.volunt.entity.User;
import com.butterfly.volunt.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public boolean validateUsernamePasswordExists(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password).isPresent();
    }

    @Override
    public boolean validateUsernameExists(String username) {
        return userRepository.findByUsername(username).isPresent();
    }

    @Override
    public List<User> listAll() {
        return userRepository.findAll();
    }
}
