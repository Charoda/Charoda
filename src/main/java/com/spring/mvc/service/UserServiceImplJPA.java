package com.spring.mvc.service;

import com.spring.mvc.dao.DAOService;

import com.spring.mvc.models.UserJPA;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class UserServiceImplJPA implements UserService {


    @Autowired
    private DAOService userDao;


    @Override
    public List<UserJPA> index() {
        return userDao.index();
    }

    @Override
    public UserJPA show(int id) {
        return userDao.show(id);
    }

    @Override
    @Transactional
    public void save(UserJPA user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void update(int id, UserJPA user) {
        userDao.update(id,user);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}
