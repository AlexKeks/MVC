package by.itacademi.hotel.web.command;


import by.itacademi.hotel.web.command.impl.Close;
import by.itacademi.hotel.web.command.impl.Guest;
import by.itacademi.hotel.web.command.impl.Login;


public class CommandChooser {

	public static Action perForAction(ActionType actionT){
		
		Action action= null;
		
		switch(actionT){
		
		case LOGIN:
			action = new Login();
			break;
			
		case GUEST:
			action = new Guest();
			break;
			
		case CLOSE:
			action = new Close();
		}
		
		
		return action;
		
	}
	
	
}
