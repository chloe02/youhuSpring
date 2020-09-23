package com.tis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tis.domain.ApplicationVO;


@Service
public interface ApplicationService {

	// 게시글 받아오기
	public List<ApplicationVO> getAppList();
	
	int getAppCount();
	
	 int applicationInsert(ApplicationVO appInsert); // 글등록
	 int applicationUpdate(ApplicationVO appUpdate); // 글수정

	ApplicationVO AppInfo(int aidx);


	
	
}
