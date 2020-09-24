package com.tis.youhu;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
		log.info("bidx==>"+bidx);
		if(bidx==0) {
			return "redirect:index";
		}
		BoardVO boardInfo = this.boSvc.boardInfo(bidx);
		model.addAttribute("bvo", boardInfo);
		
		return "youhu/BoardView";
		
	}
	
	@RequestMapping("/boardWrite")
	public String boardWirte(Model model) {
		
		return "youhu/BoardWrite";
	}
	@RequestMapping("/boardWriteEnd")
	public String boardWriteEnd(Model model, @ModelAttribute("Board") BoardVO bvo) {
		
		log.info("bvo====>"+bvo);
		
		int n = boSvc.boardInsert(bvo);
		
		String str = (n>0)?"글쓰기 성공":"글쓰기 실패";
		String loc = (n>0)?"boardList":"boardWrite";
		
		model.addAttribute("message", str);
		model.addAttribute("loc",loc);
		
		return "msg";
	}
	
	@RequestMapping("/boardEdit")
	public String BoardEdit(Model model, 
			@ModelAttribute("Board") BoardVO bvo) {
		

		if(bvo.getBidx()==0) {
			return "redirect:index";
		}
		BoardVO boardInfo = this.boSvc.boardInfo(bvo.getBidx());
		model.addAttribute("bvo", boardInfo);
		
		return "youhu/BoardEdit";
	}
			
	@PostMapping("/boardEditEnd")
	public String BoardEditEnd(Model model, @ModelAttribute("Board") BoardVO bvo) {
		
		int n = boSvc.boardEdit(bvo);
		
		String str = (n>0) ? "수정 성공":"수정 실패";
		String loc = (n>0) ? "boardList":"boardEdit";
		
		model.addAttribute("message",str);
		model.addAttribute("loc",loc);
		
		return "msg";
		
	}
}
