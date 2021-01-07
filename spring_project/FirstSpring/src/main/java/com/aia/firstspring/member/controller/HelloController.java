package com.aia.firstspring.member.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //이것을 해주어야 핸들러에 등록이 된다 
public class HelloController {
	
	
	// 메소드는 viewName을 반환해야한다.반환타입을 ModelAndView를 이용해서 반환 
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/hello"); // /WEB_INF/view/member/hello.jsp -> member/hello
		mav.addObject("greeting",greeting());
		return mav;
	}

	private String greeting() {
		
		String result ="안녕하세요.";
		
	int	nowTime = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
	if(nowTime>=6 && nowTime<=10) {
		result="좋은 아침 입니다";
		
	}else if (nowTime>=12 && nowTime<=15) {
		result="점심식사는 하셨나요?";
	}else if (nowTime>=18 && nowTime<=22) {
		
		result="저녁식사는 하셨나요?";
	}
		
		return result;
	}
}
