package first;

public class OverridingMain {

	public static void main(String[] args) {
		BaseEnSpeaker bs =new BaseEnSpeaker();
		
		//bs.showCurrentState();
Speaker s =new Speaker();

//s.showCurrentState();
//다형성
//조상클래스 타입의 참조변수에 자손틀래스타입의 인스턴스를 참조 할 수 있는것
//참조변수는  해당 타입의  멤버만 사용하겠다 라고 선언
Speaker ss=new BaseEnSpeaker();
// 참조변수 s 는 VolumeRate 변수와 showCurrentState(),setVolume()
//Speaker 클래스가 가지는 멤버
ss.setVolume(10);
//ss.setBaseRate(20);
//BaeEnSpeaker 오버라이딩한 메서드가 호출된다.
ss.showCurrentState();

	}

}
