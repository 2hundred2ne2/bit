package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		Connection conn = null;

		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver Load !!!");

			// 2. DB 연결 localhost == 127.0.0.1
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "tiger";

			conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("데이터베이스에 접속했습니다.");

			// Statment 인스턴스생성
			Statement stmt = conn.createStatement();
			
			System.out.println(" 이름을 입력해주세요 ");
			string userename =sc.
            //3. EMP 테이블에 서 “SCOTT” 사원의 급여(sal) 정보를 1000으로 바꾸는 프로그램을 작성해보자.
			
			String slqInsert="insert into emp values(SEQ_EMP_EMPNO.NEXTVAL,MJ,analyst,7566,2020-11-16,6000,0,50)";
			
			int resultCnt=stmt.executeUpdate(slqInsert);
			
			if(resultCnt>0) {
				System.out.println("데이터가 정상적으로 입력되었습니다.");
				
			}
			
			// 2.EMP 테이블의 모든 데이터를 출력하는 프로그램을 작성해보자.
			String sql = "select * from emp oderby  ";

			ResultSet rs = stmt.executeQuery(sql);
			
            
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getNString("ename");
				String job = rs.getNString("job");
				String mgr = rs.getString("mgr");
				String hiredate = rs.getString("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");

				System.out.println(empno + "\t" + ename + "\t" + job + "\t" + mgr + "\t" +

						hiredate + "\t" + sal + "\t" + comm + "\t" + deptno);
			}
       			
			
			

			rs.close();
			stmt.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			System.out.println("Driver 로드 실패");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}