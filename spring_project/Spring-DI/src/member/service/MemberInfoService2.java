package member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import member.dao.Dao;

public class MemberInfoService2 implements MemberService {

	@Autowired(required = false)//널포인트는 뜨지만 객체는 만들어 준다. 
	@Qualifier("guest")
	Dao dao ;
	
	@Override
	public Object process() {
		System.out.println("MemberInfoService 인스턴스 실행");
		dao.select(); 
		return null;
	}

}