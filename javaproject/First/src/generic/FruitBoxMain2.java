package generic;

public class FruitBoxMain2 {

	public static void main(String[] args) {
		AppleBox appleBox = new AppleBox();
		appleBox.store(new Apple(10));
		
		Apple apple=appleBox.pullOut();
		
		
		OrangeBox orangeBox = new OrangeBox();
		OrangeBox.store(new Orange(100));
		
		Orange orange=orangeBox.pullOut();
 
	}

}
