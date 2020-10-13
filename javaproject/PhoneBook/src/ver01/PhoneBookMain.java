package ver01;

public class PhoneBookMain {

	public static void main(String[] args) {
	
	PhoneInfor pi1=new PhoneInfor("손흥민", "010-0000-0000");
	PhoneInfor pi2=new PhoneInfor("박지성 ", "010-1111-1111", "96.11.16");
	
	
	pi1.showInfor();// 참조변수 pi1이 가리키는 phoneInfor의 메서드
	pi2.showInfor();
	}

}
