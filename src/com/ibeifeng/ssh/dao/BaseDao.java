package com.ibeifeng.ssh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Administrator on 2017/2/21.
 */
public class BaseDao<T> implements IBaseDao<T> {
    @Autowired
    private SessionFactory sessionFactory;
    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    private Class<T> getCla(){
        return (Class<T>)(((ParameterizedType) (this.getClass().getGenericSuperclass()))
                .getActualTypeArguments()[0]);
    }
    @Override
    public void add(T t) {
        getSession().save(t);
    }

    @Override
    public void update(T t) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public T load(int id) {
        return null;
    }

    @Override
    public List<T> list(String hql) {
        return null;
    }

    @Override
    public List<T> list(String hql, Object[] params) {
        return null;
    }

    @Override
    public List<T> list(String hql, Object[] params, int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public Long count(String hql) {
        return null;
    }

    @Override
    public Long count(String hql, Object[] params) {
        return null;
    }
}
