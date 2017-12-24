package by.itacademi.hotel.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class Listener implements ServletRequestListener {

	public void requestInitialized(ServletRequestEvent ev) {

		HttpServletRequest req = (HttpServletRequest) ev.getServletRequest();
		String com = "Request command: " + req.getQueryString();

		System.out.println(com);
		ServletContext context = ev.getServletContext();
		context.log(com);
	}

}
