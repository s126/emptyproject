package edu.nf.emptyproject.dao.support;

import edu.nf.emptyproject.dao.BaseDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

@Repository
public class HibernateDAO<T> implements BaseDAO<T> {

    @Resource
    protected SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public T get(Serializable id) {
        return null;
    }

    @Override
    public void save(T t) {

    }

    @Override
    public void remove(T t) {

    }

    @Override
    public void update(T t) {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public List<T> listAll() {
        return null;
    }
}
