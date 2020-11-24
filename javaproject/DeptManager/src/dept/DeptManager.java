package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptManager {

	// 사용자 입력
	Scanner sc = new Scanner(System.in);

	DeptDao dao = DeptDao.getInstance();

	// 부서입력 메소드 : 사용자에게 입력 받은 데이터를 DAO를 이용해서 DB 입력
	void insertDept() {

		// 부서정보를 받아서 인스턴스를 생성하고 dao.insertDept()

		System.out.println("부서정보를 입력합니다.");
		System.out.println("부서번호를 입력해주세요.");
		String deptno = sc.nextLine();
		System.out.println("부서이름을 입력해주세요.");
		String dname = sc.nextLine();
		System.out.println("지역 이름을 입력해주세요.");
		String loc = sc.nextLine();

		Dept dept = new Dept(Integer.parseInt(deptno), dname, loc);

	

		

		try {
			conn = ConnectionProvider.getconnection();
			
			resultCnt = dao.insertDept(dept, conn);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(resultCnt>0) {
			System.out.println("입력되었습니다.");
		} else {
			System.out.println("입력이 실패했습니다.");
		}
	}
	
	
	//부서 정보 수정 메소드
	void editDept() {
		
		
		System.out.println("수정할 부서번호를 입력해주세요.");
		String deptno = sc.nextLine();
		System.out.println("수정할 부서이름을 입력해주세요.");
		String dname = sc.nextLine();
		System.out.println("수정할 지역 이름을 입력해주세요.");
		String loc = sc.nextLine();

		Dept dept = new Dept(Integer.parseInt(deptno), dname, loc);
		Connection conn = null;
		
				try {
					conn =ConnectionProvider.getconnection();
					
					resultCnt = dao.updateDept(dept, conn);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(resultCnt>0) {
					System.out.println("수정되었습니다.");
				} else {
					System.out.println("수정이 실패했습니다.");
				}
				
				
				//수서 정보 삭제 
				
				void delDept() {

					System.out.println("삭제 할 부서번호를 입력해주세요.");
					String deptno = sc.nextLine();
					
					Connection conn = null;
					
							try {
								conn = ConnectionProvider.getconnection();
								
								resultCnt = dao.deleteDept(Inteser.);
								
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							if(resultCnt>0) {
								System.out.println("삭제되었습니다.");
							} else {
								System.out.println(" 실패했습니다.");
							}
				}
	
				void listDept(Connection conn){
					int resultCnt = 0;

					try {
						conn =ConnectionProvider.getconnection();
						
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if(list.isEmpty()) {
						System.out.println("저장된 정보가 없습니다.");
					} else {
						for(Dept d:list) {
							System.out.println("");
					}
					
				}
				
				
				
	
}
				void searchDept() {
					System.out.println("부서를 검색합니다.");
					conn = DriverManager.getConnection(jdbcUrl, user, password);
					
					resultCnt = dao.serchDept(Integer.parseInt(deptno),conn);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(list.isEmpty()) {
					System.out.println("저장된 정보가 없습니다.");
				} else {
					for(Dept d:list) {
						System.out.println("");
				}
					
				}
				
}