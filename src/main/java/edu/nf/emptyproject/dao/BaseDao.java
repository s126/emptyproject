package edu.nf.emptyproject.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public abstract class BaseDAO implements DAO {

    @Resource
    protected SessionFactory sessionFactory;


    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

}
