package basic;

import java.util.StringTokenizer;

public class StrngTokeniZerTest {

	public static void main(String[] args) {
		String strData="cool|진♥|jin@naver.com|27|서울 |010-8989-4542";
		StringTokenizer st=new StringTokenizer(strData,"|",true);
		
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		String pnum="Tel 82-010-9999-7777 son";
		StringTokenizer st1= new StringTokenizer(pnum);
		
		while(st1.hasMoreTokens()){
			System.out.println(st1.nextToken());
		}
System.out.println("--------------------------");
		StringTokenizer st2=new StringTokenizer(pnum," -");//구분자는 "-" "-"로도 사용
			
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}
		
		StringTokenizer st3= new StringTokenizer(pnum," -",true);
		while(st3.hasMoreTokens()){
			System.out.println(st3.nextToken());
		}
		
		
	}
	
	
	
	

}
