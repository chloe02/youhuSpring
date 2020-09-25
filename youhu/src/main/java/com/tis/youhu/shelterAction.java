package com.tis.youhu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class shelterAction extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		this.setViewPage("animalShelter.jsp"); 
		this.setRedirect(false); 
	}

}
