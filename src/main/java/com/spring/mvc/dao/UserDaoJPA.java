package com.spring.mvc.dao;

import com.spring.mvc.models.User;
import com.spring.mvc.models.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository
public class UserDaoJPA  implements DAOService {


    @PersistenceContext
    EntityManager em;

    @Override
    public List<UserJPA> index() {
        Query query = em.createQuery("from UserJPA");
        return query.getResultList();
    }

    @Override
    public UserJPA show(int id) {
        return em.find(UserJPA.class,id) ;
    }

    @Override
    public void save(UserJPA employee) {
        em.persist(employee);
    }

    @Override
    public void update(int id, UserJPA user) {
        UserJPA userforUpdate = em.find(UserJPA.class,id);
        userforUpdate.setName(user.getName());
        userforUpdate.setSurname(user.getSurname());
        userforUpdate.setAge(user.getAge());
        em.merge(userforUpdate);
    }

    @Override
    public void delete(int id) {
        em.remove(em.find(UserJPA.class,id));
    }
}
