package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriter {

	public static void main(String[] args) throws IOException {
	
		//필터스트림: BufferedWriter 기본스트림 Writer가 필요하다 
		Writer witer=new FileWriter("String.txt");
		
		BufferedWriter out=new BufferedWriter(witer);
		
		out.write("손흥민 ");
		out.newLine();// 새로운 행에서 문자열을 쓰겠다.

		out.write("올시즌은 내다 1등 이다.");
		out.newLine();
		out.newLine();
		out.write("기사 입력 완료 ");
		out.newLine();
		// 스트림 닫기
		out.close();
		
		System.out.println("기사 작성 완료 ");
	}

}
