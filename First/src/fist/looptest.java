package fist;

public class looptest {

	public static void main(String[] args) {
		//  반복의 횟수를 체크하는 인덱스
		int i=0;
		while (i<5) {
			System.out.println("자바 안녕"+i);
			i++;//탈출을 위한 연산
			
		}
		
		//do while loop
		//최소 한번 실행 후 조건에 맞게 반복 실행
        i=6;
        do {
			System.out.println("안녕자바 "+i);
			   i++;
		} while (i<5);
     //조건의 상관없이 무조건 한번은 기회를 준다.
        
        
        
        
        
	}

}
