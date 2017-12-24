package by.htp.hotel.dao.impl;

import by.htp.hotel.dao.Dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

@Repository
public class BaseDao<T> implements Dao<T> {

    private SessionFactory sessionFactory;




   /* @Autowired
    public BaseDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }*/

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    protected Class<T> clazz;

    public T add(T t) {
        getSession().save(t);

        return t;
    }

    public T update(T t) {
        getSession().update(t);
        return t;
    }

   /* public T get(Serializable id) {
        return (T) getSession().load(getPersistentClass(), id);
    }
*/


    public void delete(T t) {
        getSession().delete(t);
    }

/*
    private Class getPersistentClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
*/

}
