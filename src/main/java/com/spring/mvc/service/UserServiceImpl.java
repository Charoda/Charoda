package com.spring.mvc.service;

import com.spring.mvc.dao.UserDao;

import com.spring.mvc.models.User;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;


    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Override
    public User show(int id) {
        return userDao.show(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void update(int id, User user) {
        userDao.update(id,user);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}
