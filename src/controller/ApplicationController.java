package controller;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import action.factory.ActionFactory;
import action.impl.LoginAction;
import action.impl.LogoutAction;

public class ApplicationController {
	
	public String processRequest(String pathInfo, HttpServletRequest request) {
		/* u zavisnosti od pathinfo, kreirati klasu koja je potrebna za obradu zahteva*/
		
		String page ="/WEB-INF/pages/error/DefaultErrorPage.jsp";//default error page
		
		AbstractAction action = ActionFactory.createActionFactory(pathInfo);
		//if action = null, nije mapiran url na akciju
		if(action != null) {
			page = action.execute(request);
		}else {
			request.setAttribute("error", "Action " + request.getPathInfo() + " is not mapped to action!");
		}
		
		return page;
	}

}
