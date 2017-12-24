
package by.htp.hotel.dao.impl;


import by.htp.hotel.dao.UserDao;
import by.htp.hotel.entities.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class UserDaoImpl extends BaseDao<User> implements UserDao {

   /* @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }*/


    public User getUserByEmail(String email) {
        String hql = "from User";
        Query query = getSession().createQuery(hql);
        List<User> list = query.list();
        User user = list.get(0);
        return user;
    }


    public List<User> getAll() {

        String hql = "from User";
        Query query = getSession().createQuery(hql);

        return query.list();
    }

}