package com.spring.mvc.dao;


import com.spring.mvc.models.User;
import com.spring.mvc.models.UserJPA;

import java.util.List;

public interface DAOService {

    List<UserJPA> index();
    UserJPA show(int id);
    void save(UserJPA employee);
    void update(int id, UserJPA employee);
    void delete(int id);

}
