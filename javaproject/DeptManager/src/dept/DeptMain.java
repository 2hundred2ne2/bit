package dept;

import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DeptManager manager = new DeptManager();

		// 데이터 베이스 드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			manager.insertDept();

			System.out.println("메뉴입력");
			System.out.println("1.입력,2.수정,3.삭제,4.전체리스트,5.검색,6.종료");
			String select = sc.nextLine();
			
			
		while(true) {
	switch(select.charAt(0)) {
			
			case'1':
				break;
			case'2':
				break;
			case'3':
				break;
			case'4':
				break;
			case'5':
				break;
			case'6':
				
				break;
			
			
			}
		}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}