package com.tis.persistence;

import java.util.List;

import com.tis.domain.ApplicationVO;

public interface ApplicationDAO {
	
	List<ApplicationVO> getAppList();
	int getAppCount();
	int applicationInsert(ApplicationVO appInsert);
	ApplicationVO AppInfo(String midx);
	int applicationUpdate(ApplicationVO appUpdate);
	
}
