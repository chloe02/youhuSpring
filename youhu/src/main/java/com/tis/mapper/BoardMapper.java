package com.tis.mapper;

import java.util.List;

import com.tis.domain.BoardVO;

public interface BoardMapper {
	
	int boardInsert(BoardVO bvo);
	List<BoardVO> getBoardList();
	int getBoardCount();
	BoardVO boardInfo(int bidx);
	int boardEdit(BoardVO bEdit);
}
