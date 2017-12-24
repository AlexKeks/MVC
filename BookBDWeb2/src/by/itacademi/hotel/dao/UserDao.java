package by.itacademi.hotel.dao;

public interface UserDao {

	String readRights(String login, String pass);

	String readName(String login, String pass);

}
