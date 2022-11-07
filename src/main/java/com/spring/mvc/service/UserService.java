package com.spring.mvc.service;

import com.spring.mvc.models.User;
import com.spring.mvc.models.UserJPA;

import java.util.List;

public interface UserService {


    List<UserJPA> index();
    UserJPA show(int id);
    void save(UserJPA employee);
    void update(int id, UserJPA employee);
    void delete(int id);
}
