package ver02;

public class PaymentInfor extends SeatInfor {
String  id;// 사용자 아이디 추

	public PaymentInfor(String  id,int seatNum, int seatGread, int price) {
		super(seatNum, seatGread, price);
		this.id=id;
	}
	public PaymentInfor(String  id,int seatNum, int seatGread) {
		super(seatNum, seatGread);
		this.id=id;
	}
	@Override
		void ShowSeatTnfo() {
		System.out.println(id+"님의 예매 정보 입니다.");
			super.ShowSeatTnfo();
			
		}

}
