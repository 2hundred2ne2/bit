
package ver01;

public class payment {
int day;
int seat;
String name;
int price;

	
	payment( int day,int seat,String name,int price){
		
	this.day=day;
	this.name=name;
	this.seat=seat;
	this.price=price;
}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getSeat() {
		return seat;
	}


	public void setSeat(int seat) {
		this.seat = seat;
	}


	public String getMoney() {
		return name;
	}


	public void setMoney(String name) {
		this.name = name;
	}
	
	void showData(){ //예약 정보 저장 
	
		System.out.println("좌석 : "+seat);
		System.out.println("경기 일정 : 11월 "+day+"일");
		System.out.println("예약자:"+name);
		System.out.println("가격:"+price);
		
		
		
	}
}