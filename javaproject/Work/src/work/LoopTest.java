package work;

public class LoopTest {

	public static void main(String[] args) {
		// 20-10-05 반복문 연습문제
		// 문제1
		int num = 121;

		if (num > 0 && (num % 2) == 0) {
			System.out.println("양수이면서 짝수");
		}
		// 문제2.

		// 다음과 같이 출력이 이루어지도록 작성해보자.

		// num < 0 이라면 “0 미만” 출력

		// 0 ≤ num <100 이라면 “0이상 100 미만“ 출력

		// 100 ≤ num < 200 이라면 “100이상 200 미만“ 출력

		// 200 ≤ num < 300 이라면 “200이상 300 미만“ 출력

		// 300 ≤ num 이라면 “300이상 “ 출력

		if (num < 0) {
			System.out.println("0미만");
		} else if (num >= 0 && num < 100) {
			System.out.println("0이상100미만");
		} else if (num >= 100 && num < 200) {
			System.out.println("100이상200미만");
		} else if (num >= 200 && num < 300) {
			System.out.println("200이상300미만");
		} else if (num >= 300) {
			System.out.println("300이상");
		}
//문제3
		int num1 = 50;
		int num2 = 100;
		int big, diff;

		if (num1 > num2) {
			big = num1;
			diff = num1 - num2;
			System.out.println(big + "," + diff);
		} else {
			big = num2;
			diff = num2 - num1;
			System.out.println(big + "," + diff);
		}     
		// 문제4
		int n = 3;
		if (n == 1) {
			System.out.println("﻿\"Simple Java\"");

		} else if (n == 2) {
			
			System.out.println("﻿\"Funny Java\"");
		} else if (n == 3) {
			System.out.println("﻿\"Fantastic Java\"");
		} else {
			System.out.println("﻿\"the best programming language\"");
		}
//문제5
		num=13;
		switch (num/100) {
		case 0:
			
				System.out.println("0이상100미만");
				break;
		
			case 1:
				System.out.println("100이상200미만");
				break;
			case 2:
				System.out.println("200이상300미만");
				break;
			case 3:
			
			

		default:if(num>0) {
			System.out.println("0미만");
			} 
		System.out.println("300이상");
			break;
			
		
		
		}
	
		
		//문제6
		
		//﻿while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.
		
		int i=0;
		int sum=0;
		
	while(i<100) {
		sum+=i;
		i++;
	}
	System.out.println(sum);

	//문제7
	//﻿1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성. 
	//while문과 do~while 문을 각각 한번씩 사용해서 작성
	i=1;
	while(i<100) {
		System.out.println(i);
		i++;
	}
	do {
		System.out.println(i);
		i--;
	
	} while (i>0);
	System.out.println("-------------------------------------------------------------------------");
	//문제8
	//1000 이하의 자연수 중에서 2의 배수 이면서 7의 배수인 숫자를 출력하고,
	//그 출력된 숫자들의 합을 구하는 프로그램을 while 문을 이용해서 작성
	i=0;
	sum=0;
	while(i<=1000) {
		
		if(i%2==0&&i%7==0) {
			System.out.println(i);
			
		}
		sum=sum+i;
		i++;
	}
	System.out.println("-------------------------------------------------------------------------");	
	System.out.println(sum);
	System.out.println("-------------------------------------------------------------------------");	
	//문제10;
	sum=1;
	for(i=1;i<=10;i++) {
		System.out.println(i);
		sum=sum*i;
	}
	System.out.println(sum);
	//문제11
	for(i=1;i<10;i++) {
		System.out.println("5X"+i+"="+5*i);
	}
	//문제12
	num=0;

	int count=0;

	while((num++)<100){

	if(num%5!=0 || num%7!=0)

	continue;

	count++;

	System.out.println(num);
	
	}
	System.out.println("count: " + count);
	
	for(num=1;num<100;num++) {
		if(num%5!=0 || num%7!=0) {
			
			continue;
		}
		count++;
	}
	
	//문제13
	i=0;
	for(i=2;i<10;i=i*2) {
		System.out.println(i+"단");
		
		for(int j=1;j<=i+1;j++) {
			
			
			System.out.println(i+"X"+j+"="+i*j);
			

	}
	}
	
	
	//문제14
	num=1; sum=0;
while(true){
if(num%2==1||num%3==0&&num%2==0) {
	sum+=num;
}
if(sum>1000) {
	System.out.println("1000을 넘는 첫번째 수:"+ sum);
	break;
}
num++;
}
System.out.println("1000을 넘는 첫번째 수:"+ sum);
	
	//문제15
	n=4;
	switch (n) {
	case 1: System.out.println("﻿현재 인원은 1명입니다.");
	break;
	
	case 2: System.out.println("﻿현재 인원은 2명입니다.");
	break;
	
	case 3: System.out.println("현재 인원은 3명입니다.");
	break;
	default:if(n>3) {
		System.out.println("현재 많은 사람들이 있습니다.");
	}
	
	}
	
	//문제16
	i=1;sum=0;
	while(i<=100) {
		sum+=i;
		i++;
				
	}
	System.out.println(sum);
	i=0;sum=0;
	for(i=0;i<=100;i++) {
		sum+=i;
	}
	System.out.println(sum);
	sum=0;i=0;
	do {
		i++;
		sum+=i;
		
	}while(i<100);
	System.out.println(sum);
	
	
	
	//문제17
	
	System.out.println(" B	A");
	System.out.println("+A	B");
	System.out.println("--------");
	System.out.println(" 9	9");
	System.out.println("위 조건을 성립하는 조합은 아래와 같습니다");
	for(n=0;n<10;n++) {
		int a,b;
		a=n;
		b=9-n;
		System.out.println("A="+a+"일때, B="+b+"입니다");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}// main end

}
