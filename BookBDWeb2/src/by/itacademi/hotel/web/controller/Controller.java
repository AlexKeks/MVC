package by.itacademi.hotel.web.controller;

import by.itacademi.hotel.web.command.Action;
import by.itacademi.hotel.web.command.ActionType;
import by.itacademi.hotel.web.command.CommandChooser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(30);

		String command = request.getParameter("command");

		ActionType actionT = ActionType.valueOf(command.toUpperCase());
		Action action = CommandChooser.perForAction(actionT);
		String a = action.executeAction(request, response);
		if(request.getSession(false)!=null){
		if(session.getAttribute("userName") == null) {
			String name = action.executeName(request, response);
			   session.setAttribute("userName", name);
		  }
		}
		
		request.getRequestDispatcher(a).forward(request, response);
		
		

		
		
		/*
		 * String guest = request.getParameter("guest"); 
		 * String error = "/jsp/error.jsp"; 
		 * String er = error;
		 */
		
		/*
		 * else if (guest != null && er.equals(error)) { 
		 * ActionType actionT = ActionType.valueOf(guest.toUpperCase()); 
		 * Action action = CommandChooser.perForAction(actionT); 
		 * a = action.executeAction(request, response);
		 * request.getRequestDispatcher(a).forward(request, response); 
		 * }
		 */

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(30);

		String command = request.getParameter("command");

		ActionType actionT = ActionType.valueOf(command.toUpperCase());
		Action action = CommandChooser.perForAction(actionT);
		String a = action.executeAction(request, response);
		if(request.getSession(false)!=null){
		if(session.getAttribute("userName") == null) {
			String name = action.executeName(request, response);
			   session.setAttribute("userName", name);
		  }
		}
		
		request.getRequestDispatcher(a).forward(request, response);
		
	}

}
