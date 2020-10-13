package work;

public class OperatorTest {

	public static void main(String[] args) {
		// 05.OCT.20 과제 문제 풀이

		// 문제1.
		/*
		 * int 형 변수 num1, num2, num3가 각각 10,20,30 으로 초기화 되어 있다.
		 * 
		 * 다음문장을 실행하면 각각 변수에는 어떠한 값이 저장되겠는가?
		 * 
		 * num1=num2=num3 ;
		 * 
		 * 확인 하는 코드를 작성하고, 그 결과에 대해 설명.
		 */
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		num1 = num2 = num3;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		// 연산의 진행방향이 오른쪽에서 왼쪽으로 진행하기 때문에
		// num3의 값(30)이 num2(20->30)값으로 초기화 되고 num2(30)의 값이 num1(10->30)값으로 초기화된다.

		// 문제2
		// 수학식 {{(25x5)+(36-4)}-72}/5 의 계산결과를 출력하는 프로그램 작성.

		int result = 0;
		result = ((25 * 5 + 36 - 4) - 72) / 5;

		System.out.println(result);

		// 문제3
		// 3+6, 3+6+9, 3+6+9+12 의 연산을 하는 프로그램 작성.
		// 단. 덧셈 연산의 횟수 최소화
		int num = 0;//3의 배수의 합
		int i = 0;

		while (i < 13) {

			if (i % 3 == 0) {
				num += i;
				System.out.println(num + "," + i);

			}
			i++;

		}
		
		//문제4.

		//a= {{(25+5)+(36/4)}-72}*5, b= {{(25x5)+(36-4)}-71}/4, c=(128/4)*2 일 때

		//a>b>c 가 참이면 true 아니면 false를 출력하는 프로그램 작성
		
		int a,b,c;
		
		a=(25+5+36/4-72)*5;
		b=(25*5+36-4-71)/4;
		c=128/4*2;
		
		boolean bb=false;//참거짓 판별
		
		if (a>b||b>c) {
			bb=true;
					}
		
		System.out.println(bb);
		
		
		
		
		
		

	}// end
}
