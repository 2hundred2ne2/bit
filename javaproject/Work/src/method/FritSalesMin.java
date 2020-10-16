package method;

public class FritSalesMin {

	public static void main(String[] args) {
		
	
	   FruitSeller	seller=new FruitSeller();
	   FruitBuyer	buyer=new FruitBuyer();
		
		
		
		buyer.buyApple(seller, 2000);
		seller.showSaleResult();
		buyer.showBuyResult();
	
	

	}

}
