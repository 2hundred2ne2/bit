package fruit;

public class FruitSalesMain1 {

	public static void main(String[] args) {
		//FruitSaller 타입의 참조변수선언
		FruitSeller seller=null;
		//FruitSeller의 객체 생성
		//객체의 생성은 클래스에 정의된 멤버(변수,메서드)들을 메모리에 등록하는것
		
	 seller = new FruitSeller(); // 객체 생성후 객체의 주소
	 
	 FruitSeller Seller2=new FruitSeller();
	 
	 //fruitBuyer 타입의 참조변수 선언과 초기화
     FruitBuyer buyer=new FruitBuyer();
     
   
     
     //사과를 구매 2000원지불
     buyer.buyApple(seller,2000);
     
     System.out.println("판매자의 현재 지표");
     
     seller.showSaleResult();
     buyer.showBuyResult();
     
     
     
     
	 
	 
//	 String s="FruitSeller";
//	 seller=s;
	 
	 
	 
	}//class end

}
