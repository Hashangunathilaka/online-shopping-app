package com.shoping.onlineshoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	
	@RequestMapping(value = {"/","/home","/index"})
	
	public ModelAndView index(){
		
		ModelAndView m1 = new ModelAndView("page");
		
		m1.addObject("greeting","welcome to spring mvc");
		return m1 ;
	}
	
	
}
