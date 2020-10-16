package first;

public class CastingTest {

	public static void main(String[] args) {
		// 조상 클래스 타입의 참조변수
		Car1 car=null;
		FireEngine fe =null;
		
		car= new FireEngine();
		fe= new FireEngine();
		//fe=new car1()://d에러
		
		
	FireEngine fe2=null;
	
	fe.Water();
	//car=(Car1)fe;
	car=fe;
	
	// car= new Aumbulance();
	FireEngine f3=(FireEngine)car;
	
	if(car instanceof FireEngine) {
		f3=(FireEngine)car;
		
	}else {
		System.out.println("불을 끌수 없어");
	}
	
	//car.water();//타입이 Car1이기 떄문에 멤버가 아닌 water()사용 불가능 
	
	fe2=(FireEngine)car;//조상타입에서 자손타입으로의 형병환은 명시적으로 연산자를 사용해야한다.
	fe2.Water();
	
			}

}

class Car1{
	private String color;
	private int door;
	
	void drive() {
		System.out.println("운전한다.");
	}
	
	void stop() {
		System.out.println("멈춘다.");
	}
}
class FireEngine extends Car1 {
	void Water(){
		System.out.println("물을 뿌린다");
	}
	
}

class Aumbulance{
	
}