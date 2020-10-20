package Player;

public abstract class Player {
// 추상클래스: 클래스의 멤버 메서드 중에 하나라도 추상 메서들르 가지면 추상 클래스가 된다
	//추상 메서드: 구현하는 {} 구현부가 없는 클래스 ,메서드 정의부에 abstarect키원드를 써준다 
	//마지막에 는 ; 으로 종료
	abstract void play(int num);
abstract void stop();

	
}


abstract class VideoPlayer extends Player{
	//추상 클래스를 상속해서 추상 메서드 play, stop을 
	//
}
class AuideoPlayer extends Player{
	//추상 클래스 (상위 클래스 )의  void play의 (int num)메서드로 오버로딩 
	void play(int num) {
		
	}
	void stop() {
		
	}
}
	