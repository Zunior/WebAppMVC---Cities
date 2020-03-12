package action.impl;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;

public class DodajAction extends AbstractAction{

	@Override
	public String execute(HttpServletRequest request) {
		
//		return "/WEB-INF/DodajNoviGrad.jsp";
		return ViewConstants.ADD_CITY;
	}
	
}
