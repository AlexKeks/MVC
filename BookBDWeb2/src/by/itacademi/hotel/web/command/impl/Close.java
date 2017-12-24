package by.itacademi.hotel.web.command.impl;



import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import by.itacademi.hotel.web.command.Action;

public class Close implements Action {

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		String page =  "/Jsp/close.jsp";
		return page;
	}

	@Override
	public String executeName(HttpServletRequest request, HttpServletResponse response) throws IOException {

		return null;
	}

}
