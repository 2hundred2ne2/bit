package com.gnjk.peeps.guestbook.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gnjk.peeps.guestbook.dao.GuestbookDao;

@Service
public class GuestbookDeleteService {

	private GuestbookDao dao;

	@Autowired
	private SqlSessionTemplate template;

	public int deleteMsg(int gidx) {
		dao=template.getMapper(GuestbookDao.class);
		return dao.deleteGuestbookIdx(gidx);

	}

}
