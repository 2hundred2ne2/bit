package com.aia.firstspring.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aia.firstspring.member.domain.LoginRequest;

@Controller
@RequestMapping("/project/login")
public class ProjectLoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getLoginForm() {
		
		return new ModelAndView("project/loginForm");
		
	}
	
	/*
	 * @RequestMapping(method = RequestMethod.POST) public ModelAndView
	 * login(LoginRequest loginRequest) {
	 * 
	 * System.out.println(loginRequest);
	 * 
	 * 
	 * ModelAndView mav =new ModelAndView();
	 * 
	 * mav.addObject("userId",userID); mav.addObject("userpw",userpw); return mav; }
	 */
	
	
	

}
