
package by.htp.hotel.dao.impl;

import by.htp.hotel.entities.Order;

import by.htp.hotel.dao.OrderDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

@Repository
public class OrderDaoImpl extends BaseDao<Order> implements OrderDao {

   /* @Autowired
    public OrderDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

*/

    public List<Order> getAllForUserId(Serializable userId) {
       // EntityManager em = HibernateUtil.getEntityManager();
        //CriteriaBuilder cb = em.getCriteriaBuilder();
        //CriteriaQuery<Order> criteria = cb.createQuery(Order.class);    //getCriteriaQuery();

        //Root<Order> root = criteria.from(Order.class);//(Root<Order>) criteria.getRoots().toArray()[0];

        //criteria.select(root).where(cb.equal(root.get("user").get("id"), userId));

       // List<Order> resultList = em.createQuery(criteria).getResultList();

        return null; //resultList;
    }
}


