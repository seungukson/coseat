package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/*")
public class OcuppyController {
	
	@RequestMapping(value="occupychk",method=RequestMethod.GET )
	private String occupychk() {
		
		
		return "template";	
	}
	
		
	@RequestMapping(value="roomin",method=RequestMethod.POST )
	private String roomin(Model model) {
		model.addAttribute("mainUrl", "occupy/alert.jsp");
		model.addAttribute("goUrl", "roominView.jsp");
		
		return "template";
		// TODO Auto-generated method stub
	} 
}