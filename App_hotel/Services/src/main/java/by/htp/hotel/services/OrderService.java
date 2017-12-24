package by.htp.hotel.services;

import by.htp.hotel.entities.Order;
import by.htp.hotel.entities.User;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public interface OrderService extends Service<Order>{

    Order create(User user, Date arrivalDate, Date eventsDate);

  //  List<Order> getAllForUserId(Serializable userId);


}
