package com.aia.firstspring.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.aia.firstspring.Util.Sha256;
import com.aia.firstspring.member.dao.MemberDao;
import com.aia.firstspring.member.dao.MemberInterfaceDao;
import com.aia.firstspring.member.dao.MybatisMemberDao;
import com.aia.firstspring.member.domain.Member;
import com.aia.firstspring.service.MailSenderService;

@Service
public class MemberRegService {

//	@Autowired
//	private MemberDao dao;
	
//	@Autowired
//	private MybatisMemberDao dao;
	
	private MemberInterfaceDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	@Autowired
	private MailSenderService mailSenderService; 
	
	@Autowired
	private Sha256 sha256;
	@Autowired
	private BCryptPasswordEncoder cryptPasswordEncoder;
	//private AES256Util aes256Util;
	
	
	public int insertMember(Member member) {
		int result = 0;
		try {
			dao = template.getMapper(MemberInterfaceDao.class);
			//result = dao.insertMember(member);
			result = 1;
			
			System.out.println("암호화 : " + sha256.encrypt(member.getPassword()) );
			System.out.println("---------------------");
			System.out.println("Spring security BCryptPasswordEncoder 이용한 암호  ");
			String securiPw =cryptPasswordEncoder.encode(member.getPassword());
			System.out.println(securiPw);
			System.out.println("비밀번호 비교 메소드 : matches");
			System.out.println(cryptPasswordEncoder.matches("111", securiPw));
			System.out.println(cryptPasswordEncoder.matches(member.getPassword(), securiPw));
			
			String html = "<h1>아래 링크를 통해 인증해주세요."
					+ " <a href=\"http://localhost:8080/firstspring\"> 인증하기 </a> </h1>";
			
			// 메일 전송
//			mailSenderService.mailSend(
//					member.getMemberid(), 
//					member.getMembername(), 
//					"[안내] 회원가입을 위한 계정 인증 안내", 
//					html);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}