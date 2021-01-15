package com.aia.op.member.controller;

import org.apache.commons.io.output.NullOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
public class MemberMypageController {

	@RequestMapping("/mypage1")// /op/mypage/mypage1
	public String mypage1() {
		return "member/mypage";
	}
	@RequestMapping("/mypage2")// /op/mypage/mypage1
	public String mypage2() {
		return "member/mypage";
	}
	
	@RequestMapping("/mypage3")// /op/mypage/mypage1
	public String mypage3() {
		return "member/mypage";
		
	}
	@ExceptionHandler(NullPointerException.class)
	public String handleNullPointerException(NullPointerException e) {
		return "error/nullPointer";
	}
 
}
