package edu.nf.emptyproject.dao;


import java.io.Serializable;
import java.util.List;

public interface BaseDAO<T> {
    T get(Serializable id);
    void save(T t);
    void remove(T t);
    void update(T t);
    int count();
    List<T> listAll();
}
