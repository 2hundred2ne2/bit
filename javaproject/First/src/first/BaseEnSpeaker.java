package first;

public class BaseEnSpeaker extends Speaker {
private int baseRate;
public void setBaseRate(int base) {
	baseRate=base;
	
}	
//오버라이딩: 상속관계에서 상속받은  메서드를 선언부는 동일하게 하고 처리부를 재 구성하는 것 
@Override //어노테이션: 자바의 키워드는 아니다 .주석도 아니다. 추가적인 의미를 부여한다. 
void showCurrentState() {
	//System.out.println("메서드의 처리부분을 변경했습니다.");
	super.showCurrentState();
	System.out.println("베이스크기:"+baseRate);
}

}
