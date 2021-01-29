package com.aia.op.member.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.aia.op.member.domain.Member;

@Service
public class MailSenderService {
	
	@Autowired
	private JavaMailSender sender;
	
	public int send(Member member) {
		
		int result = 1;
		
		MimeMessage message = sender.createMimeMessage();
		
		try {
			
			// 硫붿씪 �젣紐�
			message.setSubject("[�븞�궡] �쉶�썝媛��엯�쓣 異뺥븯�빀�땲�떎.", "UTF-8");
			
			// 硫붿씪 �궡�슜 而⑦뀗痢� html
			String html = "<h1>�쉶�썝媛��엯�쓣 異뺥븯�빀�땲�떎.</h1>";
			html += "<h3>�씤利앹쓣 �쐞�빐 �븘�옒 留곹겕瑜� �겢由��빐二쇱꽭�슂</h3>";
			html += "<a href=\"http://localhost:8080/op/member/verify?id="+member.getIdx()+"&code="+member.getCode()+"\">�씤利앺븯湲�</a>";
			
			// message�뿉 �궡�슜 �쟻�슜
			message.setText(html, "utf-8", "html");
			
			// from �꽕�젙
			message.setFrom(new InternetAddress("aia.jin.202009@gmail.com"));
			
			// to �꽕�젙
			message.addRecipient(RecipientType.TO, new InternetAddress(member.getMemberid(), member.getMembername()+" �떂", "UTF-8"));
			
			// 硫붿씪 諛쒖넚
			sender.send(message);
			
		} catch (MessagingException e) {
			result = 0;
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			result = 0;
			e.printStackTrace();
		}
		return result;
	}

}








