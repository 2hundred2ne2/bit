package ver04;

public class PhoneInfor {


		
		
		// 변수 설정
		private String name;		// 친구의 이름
		private String phoneNumber;	// 전화번호
		private String addr;//주소
		private String email;	// 이메일
		
		// 생성자 : 세개의 데이터를 받아 초기화
		PhoneInfor(String name, String phoneNumber, String addr,String email){
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.addr = addr;
			this.email=email;
		}
		public String getName() {
			return name;
			
		}
		public String getphoneNumber() {
			return phoneNumber;
			
		}
		public String getaddr() {
			return addr;
			
		}
		public String getemail() {
			return email;
			
		}
		//오버라이딩처리:상속하는 클래스 추가 속성을 추력
	
		public void showData() {
			System.out.println("이름"+name);
			System.out.println("전화"+phoneNumber);
			System.out.println("주소"+addr);
			System.out.println("이메일"+email);
			
		}
		//오버라이딩처리:비어 있는 처리부를 기능을 추가
	
		public void showBasicInfo() {
			
		}
		

	
	}
