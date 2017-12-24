package by.htp.hotel.services.impl;

import by.htp.hotel.dao.Dao;
import by.htp.hotel.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;


@Transactional(transactionManager = "txManager")
public class ServiceImpl<T> implements Service<T> {


    @Autowired
    private Dao<T> baseDao;

    @Autowired
    public ServiceImpl(Dao<T> baseDao) {
        this.baseDao = baseDao;
    }

    public ServiceImpl() {

    }


    public T add(T t) {
       return baseDao.add(t);
    }


    public T update(T t) {
      return   baseDao.update(t);
    }


   /* public T get(Serializable id) {
        return baseDao.get(id);
    }*/


    public void delete(T t) {
        baseDao.delete(t);
    }
}
