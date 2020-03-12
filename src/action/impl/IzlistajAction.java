package action.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import domain.City;

public class IzlistajAction extends AbstractAction{

	@Override
	public String execute(HttpServletRequest request) {
		List<City> cities = (List<City>) request.getServletContext().getAttribute("cities");
		if(cities == null)
			cities = new ArrayList<City>();
		
		return ViewConstants.LIST_CITY;
	}
	
}
