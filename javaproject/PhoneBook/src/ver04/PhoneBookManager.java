package ver04;

import java.util.Scanner;


public class PhoneBookManager {

	private PhoneInfor[] infor;// 전화번호정보를 저장하는 배열
	private int numOfFriends = 0;// 저장된 전화번호 개수,배열의 요소 추가시 index로 사용한다

	// 생성자로 초기화
	public PhoneBookManager(int num) {
		infor = new PhoneInfor[num];
		numOfFriends = 0; 
	}

    //배열에 정보를  저장하는 기능
		void addInfo(PhoneInfor p) {
		   infor[numOfFriends++]=p;	
		}
		 //대학:1,회사:2  
		   
		   void addInfo(int choice) {
		  //사용자로 부터 기본정보를  입력받자 : 이름,전화번호,주소  	
		 	  Scanner sc=new Scanner(System.in);
		 	  System.out.println("입력을 시작합니다.");
		 	  System.out.println("이름을 입력하세요>>>");
		 	  String  name=sc.nextLine();
		 	  
		 	  System.out.println("전화 번호를 입력해주세요");
		 	  String  phoneNumber=sc.nextLine();
		 	  
		 	  System.out.println("주소를 입력해주세요");
		 	  String  addr=sc.nextLine();
		 	 System.out.println("이메일을  입력해주세요");
		 	  String  email=sc.nextLine();
		 //인스턴스를 생성해서 저장
		 	  
		 	  //인스턴스 생성
		 	  if(choice==1) {
		 		 PhoneInfor p=new PhoneInfor(name, phoneNumber, addr, email);
		 		 //배열에 저장 
		 		 addInfo(new PhoneInfor(name, phoneNumber, addr, email));
		 	  }
		 	  else if(choice==2) {
		 		  // 대학 데이터 받고 -> 인스턴스생성-> 배열에 저장
		 		  System.out.println("전공을 입력해주세요>>");
		 		  String  major=sc.nextLine();
		 		 System.out.println("학년을  입력해주세요>>");
		 		  String  year=sc.nextLine();
		 		 //PhoneInfor p= new PhoneUnivlnfor(name, phoneNumber, addr, email, major, year);
		 		  //배열에 저장 
		 		addInfo(new PhoneUnivlnfor(name, phoneNumber, addr, email, major, year));
		 		 
		 	  }else if(choice==3){
		 		  //회사데이터를 받고 ->인스턴스생성-> 배열에 저장
		 		  System.out.println("회사를 입력해주세요>>");
		 		  String  company=sc.nextLine();
		 		  //회사인스턴스를 배열에 저장
		 		 addInfo(new PhoneCompanyInfor(name, phoneNumber, addr, email, company));
		 		  
		 	  }else {
		 		  System.out.println("동호회를 입력해주세요>>");
		 		 String  club=sc.nextLine();
		 		addInfo(new PhoneBookClub(name, phoneNumber, addr, email, club));
		 	  }
		 	  System.out.println("입력이 완료되었습니다.\n");
		   }
		 	 public void showData() {
		 		  //전체 정보를 출력하는 메서드: showData()
		 		  for(int i=0; i < numOfFriends;i++) {
		 		   infor[i].showData();
		 		   System.out.println("--------------------");
		 		  }
		 		 
		 		  
		 	  }
		 		 
		 	
		 	  
		   }