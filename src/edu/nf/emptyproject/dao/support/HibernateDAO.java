package edu.nf.emptyproject.dao.support;

import edu.nf.emptyproject.dao.BaseDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class HibernateDAO<T> implements BaseDAO<T> {

    @Autowired
    protected SessionFactory sessionFactory;

    private Class<T> entityClazz = null;

    public HibernateDAO() {
        System.out.println(this.getClass());
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        this.entityClazz = (Class<T>) type.getActualTypeArguments()[0];
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(T t) {
        getSession().save(t);
    }

    @Override
    public void delete(T t) {
        getSession().delete(t);
    }

    @Override
    public void delete(Serializable id) {
        getSession().delete(findById(id));
    }

    @Override
    public void update(T t) {
        getSession().update(t);
    }

    @Override
    public T findById(Serializable id) {
        return (T) getSession().get(entityClazz, id);
    }

    @Override
    public List<T> listAll() {
        return getSession().createCriteria(entityClazz).list();
    }

    @Override
    public int count() {
        String hql = "select count(*) from " + entityClazz.getSimpleName();
        return ((Long) getSession().createQuery(hql).uniqueResult()).intValue();
    }


}
