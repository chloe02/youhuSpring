package com.tis.youhu;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tis.domain.ApplicationVO;
import com.tis.service.ApplicationService;

@Controller
public class MainController {
	
	@Inject
	private ApplicationService appSvc;
	
	@RequestMapping("/top")
	public void showTop() {
		
	}
	
	@RequestMapping("/topImage")
	public void showTopImage() {
		
	}
	
	@RequestMapping("/CenterImage")
	public String showCenterImage(Model model) {
		List<ApplicationVO> appList = this.appSvc.getAppList();
		model.addAttribute("appList", appList);
		
		return "CenterImage";
	}
	
	@RequestMapping("/footImage")
	public void showFootImage() {
		
	}
	
	@RequestMapping("/foot")
	public void showFoot() {
		
	}
	
	
	@RequestMapping(value="/main")
	public String home(ModelAndView mv) {
		
		mv.addObject("msg", "From MainController");
		mv.addObject("cr", "red");
		
		return "main";
	}
}
