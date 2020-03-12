package action.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import domain.City;
import entity.Place;
import servis.PlaceServis;
import servis.servisImpl.PlaceServisImpl;

public class DodajAction extends AbstractAction{
	private final PlaceServis placeServis;

	public DodajAction() {
		placeServis = new PlaceServisImpl();
	}

	@Override
	public String execute(HttpServletRequest request) {
		List<City> cities = (List<City>) request.getServletContext().getAttribute("cities");
		if(cities == null)
			cities = new ArrayList<City>();
		City city = new City(56000, "Kragujevac");
		
		int brojGrada = Integer.parseInt((String) request.getParameter("brojGrada"));
		String imeGrada = (String) request.getParameter("imeGrada");
		cities.add(new City(brojGrada, imeGrada));
		
		//save city in database
//		Place place = new Place(city.getCityNumber(), city.getNaziv());
		
//		return "/WEB-INF/DodajNoviGrad.jsp";
		return ViewConstants.ADD_CITY;
	}
	
	
}
