package firstJava;

import java.lang.Math;
import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 8;

		System.out.println("10/8=" + num1 / num2);
		System.out.println("10/-8=" + num1 / -8);
		System.out.println("10%-8=" + num1 % -8);
		System.out.println("10f/-8f=" + 10f / 8f); // float/float
		System.out.println("10f/8=" + 10f / 8);// float/int-> float/float
		System.out.println("10/8=" + num1 / (float) num2);

		char c1 = 'A';
		char c2 = 'B';
		System.out.println("'A'<'B'=>" + (c1 < c2));// 65<66
		System.out.println("'0'==0=>" + ('0' == 0));
		System.out.println("10.0d==10.0f=>" + (10.0d == 10.f));// 10.0d==10.0d
		System.out.println("0.1d==0.1f=>" + (0.1d == 0.1f));// 0.1d==0.1d

		double d = (double) 0.1f;
		System.out.println("d=>" + d);

		System.out.println("(flat)d==0.1f" + ((float) d == 0.1f));

		// point= 형변환의 오류를 줄일 수 있다.int->char double->float

		num1 = 10;
		num2 = 20;
		boolean result1 = num1 == 10 && num2 == 20;

		boolean result2 = num1 <= 12 || num2 >= 30;
		System.out.println("num1==10&&num2==20 =>" + result1);
		System.out.println("num1<=12||num2>=30 =>" + result2);

		if (!(num1 == num2)) {
			System.out.println("num1과 num2는 같지 않다");
		} else {
			System.out.println("num1과 num2는 같다");
		}
		// point ! 사용법

		/*
		 * 피연산자 중 표현범위가 큰 타입으로 형변환 한다. byte + short → int + int → int char + int → int +
		 * int → int float + int → float + float → float long + float → float + float →
		 * float float + double → double + double → double
		 */

		float pi = 3.141592f;

		float sPi = (int) (pi * 100) / 100f;
		System.out.println(sPi);

		int price = 11234;

		int price2 = price / 1000 * 1000;
		System.out.println(price2);

		float sPi2 = Math.round(pi * 100) / 100f;
		System.out.println(sPi2);
		// point 절사하는법

		int i = 5, j = 5;

		System.out.println(i++);// 출력:5,i=6
		System.out.println(++j);// 출력:6,i=6
		System.out.println("i=" + i + ",j=" + j);

		// 문자열처리:String 클래스 이용->객체생성->클래스가 가지는 변수와 메서드를 메모리에 로드한다
		// 참조변수: 객체의 메모리 주소 값을 저장

		String str = null; // null 참조변수가 객체의 주소 값을 저장하고 있지 않는다.
		str = "abc";// "" 공백 문자열으 이용한 객체를 생성하고 주소 값을 반환
		System.out.println(str.toString());//문자열 호출
		System.out.println(str.equals("ac"));//현재 문자열과 비교하여 찬 거짓을 알려준다
		
		//if(str!=null&&!str.equals(" ")) {
		//	System.out.println(str.charAt());//0~3-l->0,1,2
	//}	
		num1=50;
		num2=20;
		
		int big;//큰수
		int diff;//두 수의 차이
      big = num1>num2?num1:num2;
      
      diff=num1>num2?num1-num2:num2-num1;
      System.out.println("큰수:"+big+",큰수와 작은 수의 차이는  "+diff+"입니다");
		
      
      if(num1>num2) {
    	  big=num1;
    	  diff=num1-num2;
      }else {
    	  big=num2;
    	  diff=num2-num1;
    	  
      
      }
      System.out.println("큰수:"+big+",큰수와 작은 수의 차이는  "+diff+"입니다");
		System.out.println("메뉴를 선택하세요.\n 1.입력2.보기3.수정4.삭제");
		Scanner sc= new Scanner(System.in);
		int n=3;
		n=sc.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("입력합니다");
			System.out.println("simple java");
			break;
		case 2:
			System.out.println("데이터를 열랍힙니다");
			System.out.println("funny java");
			break;
		case 3:
			System.out.println("정보를 수정합니다.");
			System.out.println("fantastic java");
			break;

		default:
			System.out.println("데이터를 삭제합니다");
			System.out.println("best java");
		}

		
		
		
		
		
	}// main end

}
