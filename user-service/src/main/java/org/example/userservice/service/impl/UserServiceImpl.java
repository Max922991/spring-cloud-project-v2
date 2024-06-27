package org.example.userservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.userservice.model.User;
import org.example.userservice.repositories.UserRepository;
import org.example.userservice.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public String createUser(User user) {
        return "";
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public Boolean deleteUser(String userId) {
        return null;
    }

    @Override
    public User getUser(String userId) {
        return null;
    }
}
