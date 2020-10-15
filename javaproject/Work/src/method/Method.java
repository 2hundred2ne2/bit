package method;

public class Method {

	int add(int x, int y) {
		int result = x + y;
		return result;
	}

	void print99danAll() {

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.println(j + "*" + i + "=" + j * i + " ");

			}
		}
	}

//	두 개의 정수를 전달받아서, 
//두수의 사칙연산 결과를 출력하는 메서드와 
//이 메서드를 호출하는 main메서드를 정의해보자.
//	단, 나눗셈은 몫과 나머지를 각각 출력해야 한다.
	void Operator(int num1,int num2) {
		System.out.println("합"+(num1+num2));
		System.out.println("나누기"+(num1-num2));
		System.out.println("곱"+(num1*num2));
		System.out.println("나누기"+num1/num2+"나머지"+num1%num2);
		
	}
//	​문제2.
//
//	두 개의 정수를 전달 받아서,
// 두수의 절대값을 계산하여 출력하는 메서드와
// 이 메서드를 호출하는 main메서드를 정의해 보자.
// 단 메서드 호출 시 전달되는 값의 순서에 상관없이 절대값이 계산되어서 출력되어야 한다.

void abs(int num1,int num2) {
 System.out.println(num1=num1>0?num1:-num1);
 System.out.println(num2=num2>0?num2:-num2);
	
}



//문제3
//원의 반지름 정보를 전달하면, 
//원의 넓이를 계산해서 반환하는 메서드와
//원의 둘레를 계산해서 반환하는 메서드를 각각 정의하고,
//이를 호출하는 main메서드를 정의하자. (2*π*r), (π*r∧2)

void circle(double r) {
	double area=2*(Math.PI)*r;
	double formula=Math.PI*r*r;
	System.out.println("넓이:"+area+"둘레:"+formula);
}
//전달되는 값이 소수(prime number)인지 아닌지를 판단하여,
// 소수인경우 true를,
// 소수가 아닌 경우 false를 반환하는 메서드를 정의하고,
//이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록
// main 메서드를 정의하자.
void primeNumber() {
	boolean PN;
	for (int i = 1; i <100; i++) {
		
		for (int j = 0; j < 100; j++) {
			
		
		}
		
		
	}

	


}




}



