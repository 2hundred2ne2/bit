package generic;

public class FruitBoxMain {

	public static void main(String[] args) {
		FruitBox box1=new FruitBox();
		box1.store(new Apple(100));
		Apple apple=(Apple)box1.pullOut();
		apple.showWeight();
		
		
		FruitBox<Orange>box2=new FruitBox<Orange>();
	
		box2.store(new FruitBox<Orange>());
		
		Apple orange=box2.pullout();
		orange=.showSugarcontent();
		
		
	}

}
