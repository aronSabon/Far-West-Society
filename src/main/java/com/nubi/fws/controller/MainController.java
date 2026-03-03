package com.nubi.fws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nubi.fws.service.FrontSliderService;
@Controller
public class MainController {
	
	@Autowired
	FrontSliderService frontSliderService;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("frontSliderList" , frontSliderService.getTop5ByDateDesc());
		return "frontend/index";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "index";
	}
}
