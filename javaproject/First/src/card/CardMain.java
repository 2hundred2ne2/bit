package card;

public class CardMain {
	static int weigh = 5;

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println((int)(Math.random()*10));
		Card.play(); //클래스를 붙임으로써   클래스 이름으로 호출이 되었다.
		System.out.println(CardMain.weigh);
		System.out.println("카드의 폭 사이즈:" + Card.width); // static변수는 멤버함수로 인식하여 사용가능 직접참조
		System.out.println("카드의 높이 사이즈:" + Card.heigth);
		Card c1 = new Card();
		Card c2 = new Card();
		System.out.println("카드의 폭 사이즈:" + c1.width);
		System.out.println("카드의 높이 사이즈:" + Card.heigth);
		Card.width = 120;
		Card.heigth=50;
		System.out.println("카드의 폭 사이즈 변경");
		System.out.println("카드의 폭 사이즈:" + c1.width);
		System.out.println("카드의 높이 사이즈:" + Card.heigth);
		c1.play();
		
	}// main end
}
