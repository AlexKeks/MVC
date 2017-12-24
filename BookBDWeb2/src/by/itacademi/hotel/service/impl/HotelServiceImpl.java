package by.itacademi.hotel.service.impl;

import by.itacademi.hotel.dao.UserDao;
import by.itacademi.hotel.dao.impl.UserDaoImpl;
import by.itacademi.hotel.service.HotelService;

public class HotelServiceImpl implements HotelService{

	private UserDao dao;
	{
		dao = new UserDaoImpl();
	}
	
	
	@Override
	public String getRights(String login, String pass) {
		String rights = dao.readRights(login, pass);
		return rights;
	}


	@Override
	public String getName(String login, String pass) {
		String name = dao.readName(login, pass);
		return name;
	}

}
