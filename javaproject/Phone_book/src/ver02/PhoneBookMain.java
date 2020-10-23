package ver02;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		
 Scanner sc=new Scanner(System.in);
 while(true){
 System.out.println("이름을 입력하세요.");
 String name=sc.nextLine();
 System.out.println("번호을 입력하세요.");
 String pNum=sc.nextLine();
 System.out.println("생일 을 입력하세요.");
 String birthDay=sc.nextLine();

if(birthDay.trim().isEmpty()) {
	 PhoneInfor p= new PhoneInfor(name, pNum);
	 p.ShowInfor();
 }else {
 PhoneInfor p= new PhoneInfor(name, pNum,birthDay);
 p.ShowInfor();
	
 
 }
		
 }		
		

	}

}
