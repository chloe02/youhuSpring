package com.tis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tis.domain.BoardVO;

@Service
public interface BoardService {

	public List<BoardVO> getBoardList();

	int boardInsert(BoardVO bvo);

	int getBoardCount();

	BoardVO boardInfo(int bidx);
	
	int boardEdit(BoardVO bEdit);
}
