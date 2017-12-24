package by.htp.hotel.services;

import by.htp.hotel.entities.User;

import java.util.List;

public interface UserService extends Service<User> {
    User create(String name, String surName, String email);

    User getUserByEmail(String email);

    List<User> getAll();
}
