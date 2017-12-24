package by.itacademi.hotel.web.command;



import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {

	String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException;
	
	String executeName(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
