package com.tis.youhu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	
	void execute(HttpServletRequest req, HttpServletResponse res)
	throws Exception;
}
