package ver02;

import java.util.Scanner;

public class BookingMain {

	public static void main(String[] args) {
 BookingManager bk=new BookingManager();
		System.out.println(" 1.예약하기");
		System.out.println(" 2.결제하기 ");
		System.out.println(" 3.결제 정보 확인 ");
		System.out.println(" 4.point관리");
		System.out.println(" 5.나가기");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("메뉴를 선택해 주세요");
		int key=sc.nextInt();
		
		switch (key) {
		case 1://예약하기
		    System.out.println(" 예약자 명을 입력하세요");
		    sc.nextLine();//줄바꿈
			String name=sc.nextLine();//예약자 이름  받기
			int day=bk.dateChoice();//경기날짜 선택 //날짜반환
			int seat=bk.seatChoice();//좌석 선택 //좌석 반환
			char graed=bk.gread(seat);//좌석 등급 
			
			payment p=new payment(day, seat, name);//결제 정보클래스에 정보 저장//등급추가 
			
			System.out.println("============================");
			System.out.println(graed+"열");//등급 
			p.showData();//결제 정보 보주기
			
			
		
			break;
			
	
			
			
			
        case 2://결제하기 
        	
			
			break;
        case 3://예약  결제 정보 확인 //주량
        	break;
        	
        case 4://point
        	break;
        	
        case 5://나가기
		
		break;  
      		
		default:
			break;
		}

	}

}
