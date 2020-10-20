package ver04;

public class PhoneBookClub extends PhoneInfor {
	private String club;
	PhoneBookClub(String name, String phoneNumber, String addr, String email,String club) {
		super(name, phoneNumber, addr, email);
		this.club=club;
	}
	@Override
	public void showData() {
	
		super.showData();
		System.out.println("동호회:"+club);
	}
	@Override
	public void showBasicInfo() {
		super.showBasicInfo();
		System.out.println("이름:" + getName());
		System.out.println("번호:" + getphoneNumber());
		System.out.println("주소:" + getaddr());
		System.out.println("이메일:" + getemail());
		System.out.println("동호회:"+club);
	}

}
