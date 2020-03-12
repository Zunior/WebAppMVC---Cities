package action.impl;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;

public class DodajAction extends AbstractAction{

	@Override
	public String execute(HttpServletRequest request) {
		
//		return "/WEB-INF/DodajNoviGrad.jsp";
		return "addCity";
	}
	
}
