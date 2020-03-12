package action.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import domain.City;

public class EditAction extends AbstractAction{

	@Override
	public String execute(HttpServletRequest request) {
		List<City> cities = (List<City>) request.getServletContext().getAttribute("cities");
		if(cities == null)
			cities = new ArrayList<City>();
		
		int brojGrada = Integer.parseInt((String) request.getParameter("brojGrada"));
		String imeGrada = (String) request.getParameter("imeGrada");
		cities.remove(new City(brojGrada));
		cities.add(new City(brojGrada, imeGrada));
//		request.getServletContext().setAttribute("cities", cities);
		
		return ViewConstants.EDIT_CITY;
	}

}
