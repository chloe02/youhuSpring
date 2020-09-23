package com.tis.persistence;

import java.util.List;

import com.tis.domain.BoardVO;

public interface BoardDAO {

	int boardInsert(BoardVO bvo);
	List<BoardVO> getBoardList();
	int getBoardCount();
	BoardVO boardInfo(String bidx);
}
