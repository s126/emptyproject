package edu.nf.emptyproject.dao;


import java.io.Serializable;
import java.util.List;

public interface BaseDAO<T> {
    void save(T t);

    void delete(T t);
    void delete(Serializable id);

    void update(T t);

    T findById(Serializable id);
    List<T> listAll();

    int count();

}
