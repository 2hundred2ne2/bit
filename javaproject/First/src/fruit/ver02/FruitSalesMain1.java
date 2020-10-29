package fruit.ver02;


public class FruitSalesMain1 {

	public static void main(String[] args) {
		//FruitSaller 타입의 참조변수선언
		FruitSeller seller=null;
		//FruitSeller의 객체 생성
		//객체의 생성은 클래스에 정의된 멤버(변수,메서드)들을 메모리에 등록하는것
		
	 seller = new FruitSeller(0,30,1500); // 객체 생성후 객체의 주소
	 
	 FruitSeller Seller2=new FruitSeller(0,10,2000);
	 
	 //fruitBuyer 타입의 참조변수 선언과 초기화
     FruitBuyer buyer=new FruitBuyer(10000,0);
     
   
     //seller3
     FruitSeller Seller3=new FruitSeller();
     
     //사과를 구매 3000원지불
     buyer.buyApple(seller,3000);
     System.out.println("판매자1의 현재 지표");
     seller.showSaleResult();
     //사과구매:4000지불
     buyer.buyApple(Seller2, 4000);
     System.out.println("판매자2의 현재 지표");
     Seller2.showSaleResult();
     System.out.println("판매자3의 현재 지표");
     Seller3.showSaleResult();
     
     seller.showSaleResult();
     buyer.showBuyResult();
     
     
     
     
	 
	 
//	 String s="FruitSeller";
//	 seller=s;
	 
	 
	 
	}//class end

}
