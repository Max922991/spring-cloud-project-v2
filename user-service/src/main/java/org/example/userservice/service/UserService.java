package org.example.userservice.service;

import org.example.userservice.model.User;

public interface UserService {

    String createUser(User user);

    User updateUser(User user);

    Boolean deleteUser(String userId);

    User getUser(String userId);
}
