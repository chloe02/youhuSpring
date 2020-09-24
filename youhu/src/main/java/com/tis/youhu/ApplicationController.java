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

import com.tis.domain.ApplicationVO;
import com.tis.service.ApplicationService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class ApplicationController {

	@Inject
	private ApplicationService appSvc;

	@RequestMapping(value = "/appList", method = RequestMethod.GET)
	public String AppInfo(Model model, @RequestParam(defaultValue = "") String midx) {

		int count = this.appSvc.getAppCount();

		List<ApplicationVO> appList = this.appSvc.getAppList();
		model.addAttribute("appList", appList);
		model.addAttribute("count", count);

		return "youhu/ApplicationList";
	}

	@RequestMapping("/appWrite")
	public String AppWrite(Model model) {

		return "youhu/ApplicationWrite";
	}

	@PostMapping("/appWrite")
	public String appWriteEnd(Model model, @ModelAttribute("Application") ApplicationVO app) {
		log.info("app===>" + app);
		int n = appSvc.applicationInsert(app);

		String str = (n > 0) ? "글쓰기 완료" : "글쓰기 실패";
		String loc = (n > 0) ? "appList" : "appWrite";

		model.addAttribute("message", str);
		model.addAttribute("loc", loc);

		return "msg";
	}

	@RequestMapping("/appView")
	public String AppView(Model model, @RequestParam(defaultValue = "0") int aidx) {
		log.info("aidx === >" + aidx);
		if (aidx == 0) {
			return "redirect:index";
		}
		ApplicationVO appInfo = this.appSvc.AppInfo(aidx);
		model.addAttribute("avo", appInfo);

		return "youhu/ApplicationView";
	}

	@RequestMapping("/appEdit")
	public String AppEdit(Model model,
			@ModelAttribute("Application") ApplicationVO avo) {

		
		if (avo.getAidx()==0) {
			return "redirect:index";
		}
		ApplicationVO appInfo = this.appSvc.AppInfo(avo.getAidx());
		model.addAttribute("avo", appInfo);

		return "youhu/ApplicationEdit";
	}

	@PostMapping("/appEditEnd")
	public String AppEditEnd(Model model, 
			@ModelAttribute("Application") ApplicationVO avo) {
		int n = appSvc.applicationUpdate(avo);

		String str = (n > 0) ? "수정성공" : "수정실패";
		String loc = (n > 0) ? "appList" : "appEidt";

		model.addAttribute("message", str);
		model.addAttribute("loc", loc);

		return "msg";
	}

}
