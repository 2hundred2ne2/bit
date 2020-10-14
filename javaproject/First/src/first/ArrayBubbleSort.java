package first;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		//정수 데이터 10개를 저장하는 배열 생성
 int[] number=new int[19];
 
 //임의의 숫자 0~19까지의 숫자를 배열의 각 요소에 저장 
 for(int i=0;i<number.length;i++) {
	 number[i]=(int)(Math.random()*100);
	 System.out.print(number[i]+" ");
	 
 }
 System.out.println();
 System.out.println("===================================================");
 
 for (int i = 0; i < number.length; i++) {
	
	 boolean changed=false;//자리바뀜이 발생 했는지 체크
	 
	 //자리를 바꿈 처리 
	 for (int j = 0; j < number.length-1-i; j++) {
		
		 //왼쪽 인덱스의 값과 오른쪽 인덱스의 값을 비교하고.
		 //왼쪽 값이 크면 자리 변경
		 if(number[j]>number[j+1]) {
			 //왼쪽 값이크면 자리변경
			 int temp=number[j];
			 number[j]=number[j+1];
			 number[j+1]=temp;
			 
			 changed=true;
			 
			 
		 }
	}
	 
	 if(!changed) {
		 break;
	 }
	 for(int k:number) {
		 System.out.print(k+" ");
	 }
	 System.out.println();
}
 
 
 //String index 사용
 
 String str="ABCDE";
 String result="";
 for(int i=str.length()-1;i>=0;i--) {
	 
	 result+=str.charAt(i);//""+'A'->"A"+'B'->"AB"+'C'
 }
 System.out.println(result);
 
	 
	}

}
