package basic;

import java.math.BigInteger;

public class BigIntegerTest {

	public static void main(String[] args) {
		System.out.println("최대 정수 표현:  "+Long.MAX_VALUE);
		System.out.println("최소 정수 표현:  "+Long.MIN_VALUE);
		BigInteger bigValue1=new BigInteger("100000000000000000000");
		BigInteger bigValue2=new BigInteger("-99999999999999999999");
		
		bigValue2.abs();// 절대값
		BigInteger addResualt=bigValue1.add(bigValue2);
		BigInteger mulResualt=bigValue1.multiply(bigValue2);
		
		
		System.out.println(addResualt);
		System.out.println(mulResualt);
	}

}
