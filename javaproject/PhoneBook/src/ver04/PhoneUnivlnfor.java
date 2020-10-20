package ver04;

public class PhoneUnivlnfor extends PhoneInfor {
	private String major;// 대학 전공
	private String year;// 대학 학년

	PhoneUnivlnfor(String name, String phoneNumber, String addr, String email, String major, String year) {
		super(name, phoneNumber, addr, email);
		this.major = major;
		this.year = year;

	}

	@Override
	public void showData() {

		super.showData();
		System.out.println("전공:" + major);
		System.out.println("학년:" + year);
	}

	@Override
	public void showBasicInfo() {

		super.showBasicInfo();
		System.out.println("이름:" + getName());
		System.out.println("번호:" + getphoneNumber());
		System.out.println("주소:" + getaddr());
		System.out.println("이메일:" + getemail());
		System.out.println("전공 :" + major);
		System.out.println("학년:" + year);

	}

}
