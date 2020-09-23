package com.tis.mapper;

import java.util.List;

import com.tis.domain.ApplicationVO;

public interface ApplicationMapper {

	List<ApplicationVO> getAppList();
	ApplicationVO AppInfo(int midx);
	int applicationInsert(ApplicationVO appInsert);
	int applicationUpdate(ApplicationVO appUpdate);
	int getAppCount();
}
