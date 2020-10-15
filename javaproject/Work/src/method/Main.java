package method;

public class Main {

	public static void main(String[] args) {
		Method m=new Method();
		System.out.println(m.add(3, 4));
		
		m.print99danAll();
		m.Operator(5,2);//문제1
		m.abs(-3, 4);//문제2
		m.circle(10);
		m.primeNumber();
	}

}
