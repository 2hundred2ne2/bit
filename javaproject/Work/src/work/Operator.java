package work;

public class Operator {

	public static void main(String[] args) {
		/*
		 * 2020-09-29 예제 해석 및 문제 풀이 - 첫번째 -
		 */
		// 연산자 예제 해석 입니다.
		

		// 예제 1

		// 변수선언
		int i = 5;
		int j = 0;
		j = i++;// i는 1씩 후위 증가/ 출력값=5,i=6
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);
		i = 5;
		// 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j = 0;
		j = ++i;// 출력값=6 j=6
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);

		// 예제2

		i = 5;
		j = 5;
		System.out.println(i++);// 출력값 =5,출력후i=6
		System.out.println(++j);// 출력값=6,출력후 j=6
		System.out.println("i = " + i + ", j = " + j);

		// 예제3

		boolean power = false; // power가 false 일때
		System.out.println(power);
		power = !power;
		// power의 값이 false에서 true로 바뀐다.
		System.out.println(power);
		power = !power;
		// power의 값이 true에서 false로 바뀐다.
		System.out.println(power);

		// 예제4
		/*
		 * byte a = 10; byte b = 20; byte c = a + b; // byte c = (byte)(a+b); a+b는 int로
		 * 계산해주고 형변환 해준다. System.out.println(c);
		 */

		// 예제5
		byte a = 10;
		byte b = 30;
		byte c = (byte) (a * b);// 형변환
		System.out.println(c); // 값에 오류가 있음 출력값 44

		// 예제6
		int d = 1000000; // 1,000,000 1백만
		int e = 2000000; // 2,000,000 2백만
		long f = d * e; // 2,000,000,000,000
		System.out.println(f); // -1454759936

		// 예제7
		long g = 1000000 * 1000000; // L를 표시 하지 않으면 double으로 자동 형변환
		long h = 1000000 * 1000000L; // long형 리터럴
		System.out.println(g);
		System.out.println(h);
		// 예제 8
		int aa = 1000000 * 100000 / 1000000;
		int bb = 1000000 / 100000 * 1000000;
		System.out.println(aa);
		System.out.println(bb);

		// 예제9
		char c1 = 'a'; // c1에는 문자 'a'의 코드 값인 97이 저장된다.
		char c2 = c1; // c1에 저장되어 있는 값이 c2에 저장된다.
		char c3 = ' '; // c3를 공백으로 초기화 한다.
		i = c1 + 1; // 'a'+1 → 97+1 → 98
		c3 = (char) (c1 + 1);
		c2++;
		c2++;
		System.out.println("i=" + i);// 98
		System.out.println("c2=" + c2);// c
		System.out.println("c3=" + c3);// b

		// 예제10

		c = 'a';
		for (i = 0; i < 26; i++) { // 블럭{} 안의 문장을 26번을 반복한다.
			System.out.print((char) c++); // 'a'부터 26개의 문자를 출력한다.
		}
		System.out.println(); // 줄 바꿈을 한다.
		c = 'A';
		for (i = 0; i < 26; i++) { // 블럭{} 안의 문장을 26번을 반복한다.
			System.out.print((char) c++); // 'A'부터 26개의 문자를 출력한다.
		}
		System.out.println();
		c = '0';
		for (i = 0; i < 10; i++) {
			// 블럭{} 안의 문장을 10번을 반복한다.
			System.out.print((char) c++); // '0'부터 10개의 문자를 출력한다.
		}
		System.out.println();

		// 예제11
		// 3.141까지 절사하기
		float pi = 3.141592f;// 데이터 준비
		float shortPi = (int) (pi * 1000) / 1000f;// 1. pi*1000=3141 2./1000f
		System.out.println(shortPi); // 3.141

		// 예제12
		// Math.round함수 이용해서 절사하기
		pi = 3.141592f;
		shortPi = Math.round(pi * 1000) / 1000f; // Math.round함수 소숫점 첫번째 자리에서 반올림
		// 1.pi * 1000=3141.592f 2.반올림31412 3./1000f
		System.out.println(shortPi); // 3.142

		// 예제13
		// i가 1부터 10이 될 때까지, {}안의 문장을 반복 수행한다.
		for (i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
				// i가 3으로 나누어 떨어지면, 3의 배수이므로 출력한다.
			}
		}
		
		//예제14
		if(10 == 10.0f) { 
			 System.out.println("10과 10.0f는 같다.");
			 }
			 if('0' != 0) {//'0'은 유니코드 값
			 System.out.println("'0'과 0은 같지 않다.");
			 }
			 if('A' == 65) {//유니코드값
			 System.out.println("\"A\"는 65와 같다.");
			 }
			 int num = 5;
			 if( num > 0 && num < 9) {
			 System.out.println("5는 0보다 크고, 9보다는 작다.");
			 }
			 //예제15
			 float ff = 0.1f;
			 double dd = 0.1;
			 double d2 = (double)f;
			 System.out.println("10.0==10.0f ? "+(10.0==10.0f));
			 System.out.println("0.1==0.1f ? "+(0.1==0.1f));
			 System.out.println("f="+ff);
			 System.out.println("d="+dd);
			 System.out.println("d2="+d2);
			 System.out.println("d==f ? "+(dd==ff));
			 System.out.println("d==d2 ? "+(dd==d2));
			 System.out.println("d2==f ? "+(d2==ff));
			 
			// 예제16
			int x = 10;
			int y = -10;
			 int absX = (x >= 0) ? x : -x;
			 int absY = (y >= 0) ? y : -y;
			 System.out.println("x= 10일 때, x의 절대값은 "+absX);
			 System.out.println("y=-10일 때, y의 절대값은 "+absY);
			 
		
			 
			 
			 
	
			 
	}// main end

}
