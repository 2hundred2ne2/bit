package ver02;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
	//사용자에게 데이터를 받는다.
	Scanner s=new Scanner(System.in);
	
	while(true) {
		

//인스턴스 생성을 위해서는 이름 ,전화번호,생일 데이터를 받는다.
	System.out.println("저장을 위한 데이터를 입력해주세요");
	System.out.println("이름을 입력해 주세요 ");
	String name=s.nextLine();//
	System.out.println("번호을 입력해 주세요 ");
	String phoneNumber=s.nextLine();//
	System.out.println("생일을 입력해 주세요 ");
	String birthday=s.nextLine();//
	

//인스턴스 생성
	PhoneInfor infor= null;
	//입력 값없이 enter인 경우 공백 문자열을 반환
	//문자열의 길이가 0이면 
	if(birthday.trim().isEmpty()) {//trim() 공백을 지워줌

	infor=new PhoneInfor(name,phoneNumber,null);
	}else {
		infor=new PhoneInfor(name,phoneNumber,birthday);
	}
	//메서드 호출
	infor.showInfor();
	}
	
	}
}
