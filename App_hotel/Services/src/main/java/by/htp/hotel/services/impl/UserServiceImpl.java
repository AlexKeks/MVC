package by.htp.hotel.services.impl;

import by.htp.hotel.dao.UserDao;
import by.htp.hotel.entities.User;
import by.htp.hotel.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(transactionManager = "txManager")
public class UserServiceImpl extends ServiceImpl<User> implements UserService {


    @Autowired
    private UserDao userDao;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public User create(String name, String surName, String email) {
        User user = new User();
        user.setName(name);
        user.setSurname(surName);
        user.setEmail(email);

        return user;
    }


    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }


    public List<User> getAll() {
        return userDao.getAll();
    }
}
