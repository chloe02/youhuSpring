package com.tis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.tis.domain.ApplicationVO;
import com.tis.mapper.ApplicationMapper;

@Service
public class ApplicationServiceImpl implements ApplicationService{
	
	@Inject
	private ApplicationMapper applicationMapper;

	@Override
	public List<ApplicationVO> getAppList() {

		return this.applicationMapper.getAppList();	
	}

	@Override
	public ApplicationVO AppInfo(int aidx) {
		
		return this.applicationMapper.AppInfo(aidx);
	}

	@Override
	public int applicationInsert(ApplicationVO appInsert) {
		
		return this.applicationMapper.applicationInsert(appInsert);
		// TODO Auto-generated method stub
		
	}

	@Override
	public int applicationUpdate(ApplicationVO appUpdate) {
		return this.applicationMapper.applicationUpdate(appUpdate);
	}

	@Override
	public int getAppCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
