package generic;

public class FruitBoxMain3 {

	public static void main(String[] args) {
		FruitBox<Apple> box1=new FruitBox<Apple>(new Apple(100));
		//box1.store(new Apple(10)));
		Apple apple=(Apple)box1.pullOut();
		apple.showWeight();
		
		FruitBox<Orange> box2=new FruitBox<Orange>(new Orange(100));
		//box2.store("Apple");//Apple 타입만 들어가야한다!!	
		Apple Orange=(Orange)box2.pullout();
		Orange.showWeight();
		
		
	}

}
