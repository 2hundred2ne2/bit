package ver02;

public class payment {
int day;
int seat;
String name;

	
	payment( int day,int seat,String name){
		
	this.day=day;
	this.name=name;
	this.seat=seat;
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
	
	void showData(){
	
		System.out.println("좌석 : "+seat);
		System.out.println("경기 일정 : 11월 "+day+"일");
		System.out.println("예약자:"+name);
		
		
		
	}
}
