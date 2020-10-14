package first;

public class ArrayTest2 {

	public static void main(String[] args) {
	//2차원 배열의 선언: 자료형[][] 배열의 이름
int[][] arr=null;
//2차원배열의 생성 :new 자료형[행의개수][열의개수]
	arr=new int[3][4];
	
//2차원배열의 참조 : 배열이름[행의 index][열의 index],index는0부터 시작

	arr[0][0]=10;//데이터 저장 
	System.out.println("arr[0][0]=>"+arr[0][0]);
	arr[1][3]=13;
	System.out.println("arr[1][3]=>"+arr[1][3]);
	//2차언배열은 1차원 배열으 가지는 배열이다
    System.out.println(arr.length);//1차원 배열을 저장하는 주소값 //2차원 배열 arr의 length값은 1차원 배열의 개수를 가진다
	System.out.println(arr[0].length); //arr[0]는 첫번째  1차원 배열을 가르키는  주소 값을 저장하는 변수이다 .//arr의  length 값은 2차원 배열의 행의 개수다
	System.out.println(arr[1].length);//arr[1]는 두번째  1차원 배열을 가르키는  주소 값을 저장하는 변수이다 
	System.out.println(arr[2].length);//arr[2]는 세번째  1차원 배열을 가르키는  주소 값을 저장하는 변수이다 
		
	for(int i=0;i<arr.length;i++) { //0,1,2 열
	for(int j=0;j<arr[i].length;j++) {//0,1,2,3 행
		System.out.print(arr[i][j]+"\t");
	}
	System.out.println();
		}
	System.out.println("=================================================");
	for(int i=0;i<arr.length;i++) { //0,1,2 열
		for(int j=0;j<arr[i].length;j++) {//0,1,2,3 행
		arr[i][j]=i+j;
		
		}
		
			}
	for(int i=0;i<arr.length;i++) { //0,1,2 열
		for(int j=0;j<arr[i].length;j++) {//0,1,2,3 행
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}	
	System.out.println("=================================================");
	showdata(arr);
	
	
	//가변 배열 
	int[][] arr2 = new int[3][]; //1차원배열 사이즈 상관없이  3개 만듬
	arr2[0]=new int[3];
	arr2[1]=new int[5];
	arr2[2]=new int[9];
	System.out.println("=================================================");
	//배열의 요소출력
	showdata(arr2);
	
	String[][] place=new String[6][];
	place[0]=new String[2];
	place[1]=new String[4];
	place[2]=new String[3];
	place[3]=new String[3];
	place[4]=new String[3];
	place[5]=new String[3];
	
	System.out.println("자리배치============================================");
	showdata(place);
  
	
	int[][]arr3= {
			{1,2},
			{3,4,5},
			{6,7,8,9}
			
	};
	System.out.println("2차원 배열의 세로길이 (1차원 배열의 개수 ):"+arr3.length);
	for (int i = 0; i < arr3.length; i++) {
		System.out.println("arr3["+i+"].length="+arr3[i].length);
	}
	
	
	//for-each 구문 : 배열의 원본데이터의 수정이아닌 일괄 참조의 목적일 때 사용 할 수 있다.
	int[] arr4= {1,2,3,4,5};
	
	int sum=0;
	for(int n:arr4) {
		//System.out.println(n);
	sum+=n;
	}
	System.out.println("배열 arr4의 요소들의 합:"+sum);
	
	
//for-each에서의 값의 변경 -> 배열에는 영향을 주지 않는다.
 
	for (int n:arr4) {
		n++;
		System.out.println(n);
	}
	//--->이걸 한다고해서 바뀌지 않는다
	System.out.println("=================================");
	
	for (int n : arr4) {
		System.out.println(n);
	}
	
	
	}//main end
	
	//정수형 2차원 배열을 전달 받아 모든 요소의 값을 출력하는 메소드 ,반환하는데이터는 없다

	static void showdata(int[][] arr) {
		

		for(int i=0;i<arr.length;i++) { //0,1,2 열
			for(int j=0;j<arr[i].length;j++) {//0,1,2,3 행
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}


	}//showdata end 
	
static void showdata(String [][] arr) {
		

		for(int i=0;i<arr.length;i++) { //0,1,2 열
			for(int j=0;j<arr[i].length;j++) {//0,1,2,3 행
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}


	}//showdata end //오버로딩
	
	
	
	
	
}
