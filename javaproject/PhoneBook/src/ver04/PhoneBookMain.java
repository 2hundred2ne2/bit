package ver04;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		// PhoneBookManager 인스턴스 생성 : 배열과 메서드 사용
		PhoneBookManager manager = new PhoneBookManager(10);
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("전화번호 관리 프로그램 ===============");
			System.out.println("메뉴를 입력하세요");
			System.out.println(" 1. 일반정보 저장");
			System.out.println(" 2. 대학 정보 저장");
			System.out.println(" 3. 회사 정보 저장 ");
			System.out.println(" 4. 동호회 정보 저장 ");
			System.out.println("5. 전체 정보 확인  ");
			System.out.println(" 6. 프로그램 종료 ");
			System.out.println("================================");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			
				
				 case 1 :case 2 :case 3 : case 4 :
					 manager.addInfo(choice);
				
					break;
			
				 case 5 :
					 manager.showData();
				
					break;
				case 6 :
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					return ;
			}
			
			

			
			
		}
		
		
		
		
		
		
		
		
		
	}

}