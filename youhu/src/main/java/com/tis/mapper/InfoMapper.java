package com.tis.mapper;

import com.tis.domain.infoVO;

public interface InfoMapper {
	infoVO selectByDog(String value);
	infoVO selectByArea(String value);
	
	
}
