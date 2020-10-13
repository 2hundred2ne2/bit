package firstJava;

public class Looptest {

	public static void main(String[] args) {
		// 반복의 횟수를 체크하는 인덱스
		int i = 0;
		while (i < 5) {
			System.out.println("자바 안녕" + i);
			i++;// 탈출을 위한 연산

		}
		
System.out.println("+++++++++++++++++++++++++++++++++++++++");

		// do while loop

		// 최소 한번 실행 후 조건에 맞게 반복 실행
		i = 6;
		do {
			System.out.println("안녕자바 " + i);
			i++;
		} while (i < 5);
		// 조건의 상관없이 무조건 한번은 기회를 준다.
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		// for Loop
		int sum = 0;// 합을 구하기 위한 변수

		for (int j = 1; j < 11; j++) { // j는 for 블럭 안에서만 사용가능한 변수이다.

			sum += j;

		}
		System.out.println("1~10까지의합:" + sum);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		// 0부터 몇까지 더해나갔을 때 합이 100이 넘어가는지 확인하는 프로그램

		sum = 0;
		i = 0;

		// 몇번을 반복해야 하는지 모르는 경우 : 무한반복 처리
		while (true) {

			// 탈출의 조건
			if (sum > 100) {
				break;

			}

			i++; 		// 더하는 수의 증가
			sum += i;	// 합을구하는 연산
		}
		System.out.println(i+"를 더했을 때 100이 넘어 갑니다. 100이 넘어가는 최초의 값은 "+sum);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		//1~10까지의 수중 3의 배수를 생략하고 출력
		i=0;
		for(i=0;i<11;i++) {
			
			if(i%3==0) { //3의 배수를 찾는 조건
				continue;
				
			}
			System.out.println(i);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		// continue를 이용한 숫자 찾기
		//0~100까지의 숫자 중에 5의 배수 이면서 7의 배수인 숫자를 출력하고 총 몇개가 존재하는지 개수를 출력하자
		int num=0;
		int count=0;
		
		while(++num<100) {
			//num++;
			
			if(num%5!=0||num%7!=0) {//!(num%5==0 and num%7==0)
				continue;
			}
			count++;
			System.out.println(num);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		outerLoop:for (i = 1;  i<10; i++) {
			System.out.println(" ");
			for (int j = 0; j < 10; j++) {
				System.out.print("["+i+","+j+"]");
				if(i%2==0&&j%2==0)
					break outerLoop;
				
			}
		}
		
	}// end class

}
