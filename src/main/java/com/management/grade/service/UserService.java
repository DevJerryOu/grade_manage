package com.management.grade.service;

import com.management.grade.model.User;

public interface UserService {
    User getUserById(int id);

    User getUserByName(String userName);

    boolean insertNewUser(User user);
}
