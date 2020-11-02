package ver02;

import java.util.Scanner;
import java.util.function.Predicate;

public class BookingManager  {
	
	int Seat;
	static char gread;  //좌석 등급
	int price=0;
	int myMoney;//현재 가진돈

	public static int dateChoice() {
	    int date;
		Scanner sc=new Scanner(System.in);
		String[][] day = new String[5][7];  //5*7열의  배열 생성
		int cnt = 1; //11월 달력 날짜생성    
		System.out.println("=========11월==경=기=선=택===========");
				
		for (int i = 0; i < day.length; i++) {     
			for (int j = 0; j < day[i].length; j++) {
				System.out.printf(" %3s",(cnt++));   //3글자로해서 seats값 출력
			}
			System.out.println();    
		}
		System.out.println("================================");
		System.out.println("경기 일정을 선택하세요.");
		date=sc.nextInt();
		System.out.println("10월 "+date+"일"+ " 경기 선택");
		
		
		
		
		
	return date;
	
	}

	
		
	
	
	public static int seatChoice() { //자석 선택

			Scanner sc=new Scanner(System.in);
			int cnt ; //예약된 좌석 수 
			//char  gread= 'A';     
			String[][] Seats = new String[3][10];  //30석
		     cnt = 1; //1좌석  
			
			System.out.println("===========좌=석=선=택===========");
					
			for (int i = 0; i < Seats.length; i++) {     
				for (int j = 0; j < Seats[i].length; j++) {
					if (i==0) {
						gread='A';
						
						System.out.printf(" %4s A석",(cnt++));
					}else if (i==1) {
						System.out.printf(" %4s B석",(cnt++));
						gread='B';
						
					}else {
						System.out.printf(" %3s C석",(cnt++),'C');
						gread='C';
					}
				}
				System.out.println();    
			}
			System.out.println("================================");
			
			System.out.println("좌석을 선택하세요.");
			int seat=sc.nextInt();
			System.out.println( seat+""+gread+"좌석선택");
			
			
			
			return seat;
							
		
	}
	
     char gread (int Seat ){
    	 if(Seat<=10) {
    		 gread='A';
    	 }
    	 else if(Seat>20) {
    		 gread='C';
    	 }
    	 else {
    		 gread='B';
    	 }
    		   
    		 
    	 
    	 
    	 return  gread;
    	 
    	 
    	 
    	 
     }
     
     int price(char gread){//가격 정해듐
    	 
    	 
    	price=(gread=='A')?1000:((gread=='B')?5000:3000);  
    	 return price;
    	 
     }
     
     int payed(int price) {// 내돈에서  깎임 
    	 
    	
    	 myMoney-=price; 
    	 
    	 return myMoney;
    	 
     }
     
     
}  
     
     
	

