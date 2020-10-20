package ver04;

public class PhoneCompanyInfor extends PhoneInfor {
	private String company;
	
	PhoneCompanyInfor(String name, String phoneNumber, String addr, String email,String company) {
		super(name, phoneNumber, addr, email);
		this.company=company;
	}

	@Override
	public void showData() {
	
		super.showData();
		System.out.println("회사:"+company);
	}

	@Override
	public void showBasicInfo() {
		
		
		super.showBasicInfo();
		System.out.println("이름:" + getName());
		System.out.println("번호:" + getphoneNumber());
		System.out.println("주소:" + getaddr());
		System.out.println("이메일:" + getemail());
		System.out.println("회사:"+company);
		
		
	}

}
