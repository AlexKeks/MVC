package by.htp.hotel.services;

import java.io.Serializable;

public interface Service<T>{

    T add(T t);

    T update(T t);

   // T get(Serializable id);

    void delete(T t);

}
