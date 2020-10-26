package io;

import java.io.File;

import javax.swing.JPopupMenu.Separator;

public class FileMove {

	private static final String Separator = null;

	public static void main(String[] args) {
		//File 클래스는 경로를 저장한다.
		//File 경로, 폴더의 경로
		//파일 또는 폴더의 속성을 변경하거나 삭제 생성이 가능 
		
		//현재 존재하는 파일의 경로를 생성
		File myFile=new File("c:\\my Java\\my.bin");
		
	myFile.delete();	
		
if(myFile.exists()) {
	System.out.println("원본 파일이 준비되어 있지 않습니다.");
	System.out.println("프로그램릉 종료합니다");
	return;
}
//System.out.println("파일존재");
	File reDir=new File("c:"+Separator+"\\yourJava");
	reDir.mkdir(); //해당경로에 폴더가 존재하면 그대로유지, 없으면 폴더 생성
	System.out.println("폴더 생성 성공");
	//파일을 이동할 새로운 경로 생성 
	File refile=new File(reDir,"your.bin");
	
	
	System.out.println("파일 존재 유무 : "+ refile.exists());
	// 파일이동
	myFile.renameTo(refile);
	if(refile.exists()) {
		System.out.println("파일이동성공");
		
	}else {
		System.out.println("파일이동 성공");
	}
	
	}
}
