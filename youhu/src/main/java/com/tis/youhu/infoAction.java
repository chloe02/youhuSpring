package com.tis.youhu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class infoAction extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//System.out.println("Center소개 페이지");
		
		this.setViewPage("infoCenter.jsp"); 
		this.setRedirect(false); 
	}

}
