package com.cap.dbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cap.dbootjpa.dao.ARepo;
import com.cap.dbootjpa.model.A;

@Controller
public class AController {

	@Autowired
	ARepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	
	@RequestMapping("/addA")
	public String addA(A a){
		
		repo.save(a);
		return "home.jsp";
				
	}
	
	
	@RequestMapping("/getA")
	public ModelAndView getA(@RequestParam int aid){
		
		ModelAndView mv = new ModelAndView("showA.jsp");
		A a = repo.findById(aid).orElse(new A());
		
		mv.addObject(a);
		return mv;
				
	}
	
	
	
	@RequestMapping("/deleteA")
	public ModelAndView deleteA(@RequestParam int aid){
		
		ModelAndView mv = new ModelAndView("deletedata.jsp");
		A a = repo.findById(aid).orElse(new A());
		repo.delete(a);
		mv.addObject(a);
		return mv;
				
	}
	
	
	
}
