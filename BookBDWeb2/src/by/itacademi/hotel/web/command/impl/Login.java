package by.itacademi.hotel.web.command.impl;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademi.hotel.service.HotelService;
import by.itacademi.hotel.service.impl.HotelServiceImpl;
import by.itacademi.hotel.web.command.Action;

public class Login implements Action {

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {

		HotelService service = new HotelServiceImpl();
		String page = "/Jsp/error.jsp";
		String login = request.getParameter("login");
		String pass = request.getParameter("password");
		String adm = "all";
		String all = adm;
		String us = "limited";
		String lim = us;
		
		String rights = service.getRights(login, pass);
		if(rights!=null){
		if(rights.equals(all)){
			page = "/Jsp/admin/admin.jsp";
		}
		else if(rights.equals(lim)){
			page = "/Jsp/user/user.jsp";
		}			
		}
		return page;
	}

	@Override
	public String executeName(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HotelService service = new HotelServiceImpl();
		String login = request.getParameter("login");
		String pass = request.getParameter("password");
		String name = service.getName(login, pass);
		return name;
	}

}
