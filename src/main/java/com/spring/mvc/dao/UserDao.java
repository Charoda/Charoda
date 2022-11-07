package com.spring.mvc.dao;

import com.spring.mvc.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public class UserDao  {
//
//    private List<User> users;
//    private static int PEOPLE_COUNT;
//
//    {
//        users = new ArrayList<>();
//        users.add(new User(++PEOPLE_COUNT,"Bob","Jhonson",100));
//        users.add(new User(++PEOPLE_COUNT,"Hilary","Klinton",40));
//        users.add(new User(++PEOPLE_COUNT,"Jeff","Bezos",50));
//        users.add(new User(++PEOPLE_COUNT,"Mark","Zukerberg",20));
//    }
//
//    public List<User> index() {
//        return users;
//    }
//
//    public User show(int id) {
//        return users.stream().filter(emp -> emp.getId() == id).findAny().orElse(null);
//    }
//
//    public void save(User user) {
//        user.setId(++PEOPLE_COUNT);
//        users.add(user);
//    }
//
//    public void update(int id, User user) {
//        User employeeToBeUpdated = show(id);
//        employeeToBeUpdated.setName(user.getName());
//        employeeToBeUpdated.setSurname(user.getSurname());
//        employeeToBeUpdated.setAge(user.getAge());
//    }
//
//
//    public void delete(int id) {
//        users.removeIf(emp -> emp.getId() == id);
//    }


}