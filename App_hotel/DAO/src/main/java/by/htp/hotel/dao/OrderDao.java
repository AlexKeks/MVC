package by.htp.hotel.dao;

import by.htp.hotel.entities.Order;

import java.io.Serializable;
import java.util.List;

public interface OrderDao extends Dao<Order>{
    List<Order> getAllForUserId(Serializable userId);
}
