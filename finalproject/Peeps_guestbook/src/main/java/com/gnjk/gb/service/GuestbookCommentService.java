package com.gnjk.gb.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gnjk.gb.dao.GuestbookDao;
import com.gnjk.gb.domain.GuestbookComment;
import com.gnjk.gb.domain.GuestbookCommentRequest;
@Service
public class GuestbookCommentService {
	public GuestbookDao dao;
	
	@Autowired
	private SqlSessionTemplate template;

	
	// 댓글 작성
		public int cmtInsert(GuestbookCommentRequest request) {

			dao = template.getMapper(GuestbookDao.class);

			int result = 0;

			GuestbookComment comment = request.GetCmt();

			result = dao.insertCmt(comment);

			return result;
		}
		

}
