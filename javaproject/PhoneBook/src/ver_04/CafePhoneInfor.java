package ver_04;

public class CafePhoneInfor extends PhoneInfor {
//동호회이름,닉네임
	private String cafeName;
	private String nickName;
	
	
	public CafePhoneInfor(String name, String phoneNumber, String addr, 
			String email,String cafeName,String nickName) {
		super(name, phoneNumber, addr, email);
		this.cafeName=cafeName;
		this.nickName=nickName;
	}


	public String getCafeName() {
		return cafeName;
	}


	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	@Override
	public void showInfor() {
	
		super.showInfor();
	System.out.println("동호회이름:"+cafeName);
	System.out.println("닉네임:"+nickName);
	}

}
