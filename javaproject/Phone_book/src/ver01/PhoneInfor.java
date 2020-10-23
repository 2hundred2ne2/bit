package ver01;

public class PhoneInfor {
//멤버변수 선언
	String name;
	String phoneNumber;
	String birthDay;

// 생성자
  PhoneInfor(String name, String pNum, String BirthDay) {

		this.name=name;
		this.phoneNumber = pNum;
		this.birthDay = BirthDay;

	}
	 PhoneInfor( String name,String pNum){
		 this.name=name;
		 this.phoneNumber=pNum;
		 this.birthDay="생일 정보 없음";
	 }


//호출메서드
	void ShowInfor() {
		System.out.println("이름: "+name);
		System.out.println("번호: "+phoneNumber);
		System.out.println("생일: "+birthDay);
		
	}

}
