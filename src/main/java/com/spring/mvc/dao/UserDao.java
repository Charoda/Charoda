package com.spring.mvc.dao;


import com.spring.mvc.models.User;

import java.util.List;

public interface UserDao {

    List<User> index();
    User show(int id);
    void save(User employee);
    void update(int id, User employee);
    void delete(int id);

}
