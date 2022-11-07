package com.spring.mvc.service;

import com.spring.mvc.models.User;

import java.util.List;

public interface UserService {


    List<User> index();
    User show(int id);
    void save(User employee);
    void update(int id, User employee);
    void delete(int id);
}
