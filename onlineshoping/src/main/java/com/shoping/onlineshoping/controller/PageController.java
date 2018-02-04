package com.shoping.onlineshoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	
	@RequestMapping(value = {"/","/home","/index"})
	
	public ModelAndView index(){
		
		ModelAndView m1 = new ModelAndView("page");
		
		m1.addObject("title","Home");
		m1.addObject("userClickHome",true);

		return m1 ;
	}
	
@RequestMapping(value = {"/about"})
	
	public ModelAndView about(){
		
		ModelAndView m1 = new ModelAndView("page");
		
		m1.addObject("title","About");
		m1.addObject("userClickAbout",true);

		return m1 ;
	}
	
@RequestMapping(value = {"/list-product"})

public ModelAndView listOfProduct(){
	
	ModelAndView m1 = new ModelAndView("page");
	
	m1.addObject("title","List of Product");
	m1.addObject("userClickListOfProduct",true);

	return m1 ;
}
@RequestMapping(value = {"/contacts"})

public ModelAndView contacts(){
	
	ModelAndView m1 = new ModelAndView("page");
	
	m1.addObject("title","Contacts");
	m1.addObject("userClickContacts",true);

	return m1 ;
}
}
