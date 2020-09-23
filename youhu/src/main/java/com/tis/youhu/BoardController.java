package com.tis.youhu;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tis.domain.BoardVO;
import com.tis.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class BoardController {
	
	@Inject
	private BoardService boSvc;
	
	@RequestMapping(value="/boardList", method=RequestMethod.GET)
	public String getBoardList(Model model, @RequestParam(defaultValue="")String midx) {
		
		int count = this.boSvc.getBoardCount();
		
		List<BoardVO> boardList = this.boSvc.getBoardList();
		model.addAttribute("boardList", boardList);
		model.addAttribute("count", count);
		
		return "youhu/BoardList";
	}
	
	@RequestMapping("/boardView")
	public String BoardView(Model model, @RequestParam(defaultValue="")int bidx) {
		if(bidx==0) {
			return "redirect:index";
		}
		BoardVO boardInfo = this.boSvc.boardInfo(bidx);
		model.addAttribute("bvo", boardInfo);
		
		return "youhu/BoardView";
		
	}
	
	@RequestMapping("/boardEdit")
	public String BoardEdit(Model model) {
		
		return "youhu/BoardEdit";
	}
}
