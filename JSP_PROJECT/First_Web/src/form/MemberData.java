package form;

import java.util.Arrays;

// Form 에서 전송되는 데이터를 저장하는 beans 정의
public class MemberData {

	// 속성 : 변수는 private
	private String id; // 사용자의 이름 name=null
	private int pw; // 사용자의 pw pw=null
	

	// beans 는 컨테이너가 객체를 생성하기 때문에 기본 생성자는 필수
	public MemberData() {
	}

	public MemberData(String id, int pw) {
		this.id = id;
		this.pw = pw;
		
	}

	// 각 변수들의 getter/setter 메소드를 정의
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}

	

	@Override
	public String toString() {
		return "MemberData [id=" + id + ", pw=" + pw +  "]";
	}

}