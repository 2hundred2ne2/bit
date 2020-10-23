package generic;

public class FruitBox<T> {//T->Apple

T fruit;//Apple fruit


public FruitBox<T>(T obj) {
	this.fruit=obj;
}

	public void store(T fruit) {//public void store(Apple fruit
		this.fruit=fruit;
		
		
	}
	private T pullOut() {//private Apple  pullOut
		return fruit;
	}

	}


