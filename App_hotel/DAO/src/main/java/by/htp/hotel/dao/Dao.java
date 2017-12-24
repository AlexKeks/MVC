package by.htp.hotel.dao;

import by.htp.hotel.entities.User;

import java.io.Serializable;
import java.util.List;

public interface Dao<T> {

    T add(T t);

    T update(T t);

   // T get(Serializable id);

    void delete(T t);


}
