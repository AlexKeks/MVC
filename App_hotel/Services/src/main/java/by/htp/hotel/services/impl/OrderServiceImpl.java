package by.htp.hotel.services.impl;

import by.htp.hotel.dao.Dao;
import by.htp.hotel.dao.OrderDao;
import by.htp.hotel.entities.Order;
import by.htp.hotel.entities.User;
import by.htp.hotel.entities.enums.OrderStatus;
import by.htp.hotel.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.sql.Date;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
@Transactional(transactionManager = "txManager")
public class OrderServiceImpl extends ServiceImpl<Order> implements OrderService {

    public OrderServiceImpl(Dao<Order> baseDao) {
        super(baseDao);
    }

    @Autowired
    private OrderDao orderDao;

    public OrderServiceImpl() {
        super();
    }


    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Order create(User user, Date arrivalDate, Date eventsDate) {

        Order order = new Order(/*iduser*/);
        order.setStatus(OrderStatus.NEW);
        //Room room = roomDao.getAnyForRoomType(roomTypeId);
       // order.setRoom(room);
        order.setArrivalDate(arrivalDate);
        order.setEventsDate(eventsDate);
        // calculate order.total
       // Integer price = room.getRoomType().getPrice();
        //long periodDays = order.getArrivalDate().toLocalDate()
       //         .until(order.getEventsDate().toLocalDate(), ChronoUnit.DAYS);
        order.setTotal(/*price*/5 /** periodDays*/);

        return order;
    }



   /* @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Order> getAllForUserId(Serializable userId) {

        return orderDao.getAllForUserId(userId);
    }*/
}
