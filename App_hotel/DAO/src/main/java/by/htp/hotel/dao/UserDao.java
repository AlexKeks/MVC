package by.htp.hotel.dao;

import by.htp.hotel.entities.User;

import java.util.List;

public interface UserDao extends Dao<User> {
        User getUserByEmail(String email);
        List<User> getAll();
}
