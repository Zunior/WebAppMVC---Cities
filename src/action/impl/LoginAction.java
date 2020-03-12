package action.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;

public class LoginAction extends AbstractAction{

	@Override
	public String execute(HttpServletRequest request) {
		List<User> users = (List<User>) request.getServletContext().getAttribute("array");
		if(users == null) {
			users = new ArrayList<User>();
		}
		
		String page = ViewConstants.LOGIN;
		String errorMessage = "Podaci nisu ispravni!";
		
		boolean ispavno = false;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		for (User user : users) {
			if(user.getName().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				HttpSession session = request.getSession(true);
				page = ViewConstants.HOME;
				session.setAttribute("currentUser", user);
				ispavno = true;
				break;
			}else {
				
			}
		}
		if (ispavno)	
			request.setAttribute("errorMessage", errorMessage);
	
		return page;
	}
	
}
