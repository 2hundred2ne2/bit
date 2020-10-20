package work;

public class StringTest {

	public static void main(String[] args) {
//		문제 1. 다음 형태로 String 인스턴스를 생성.
//		String str = “ABCDEFGHIJKLMN”;
//		그리고 이 문자열을 역순으로 다시 출력하는 프로그램을 작성.
		
		String str="ABCDEFGHIJKLMN";
		String result="";
		for (int i =str.length()-1; i >=0; i--) {
			result+=str.charAt(i);
			
			System.out.println(result);
		}
		System.out.println(result);
		
		System.out.println("==========================================");
	
		
	
//substring을 이용하여 문장을 잘라낸다
//가장 마지막 문장을 부터 자르고 length-1~length
		                    //length-2~length-1
		                    //length-3~length-2 -> 반복해서 출력한다
//		System.out.println("==========================================");
//		str = "ABCDEFGHIJKLMN"; 
		for (int i = 1; i <str.length(); i++) {

	System.out.print(str.substring(str.length()-i,str.length()-i+1));
	str = "ABCDEFGHIJKLMN";//초기화 

	
	}

		
		


		
		
		
System.out.println("==========================================");
		
//문제 2. 다음 형태로 주민번호를 담고 있는 String 인스턴스를 하나 생성
//		String str = “990929-1010123”
//		이 문자열을 이용하여 중간에 삽입된 – 를 뺀 String 인스턴스를 생성.

		String str2 = "990929-1010123";
		String[] arr= str2.split("-");//주민번호를 배열에 넣고 "-" 기준 으로 끊어준다.
		for(int i=0;i<arr.length;i++) { //배열을 반복하며 출력하다 
			System.out.print(arr[i]);
			}
		
		
		
	}

}
