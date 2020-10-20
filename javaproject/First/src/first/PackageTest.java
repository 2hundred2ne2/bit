package first;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class PackageTest {

	public static void main(String[] args) {
		

		//java.util.Date today=new java.util.Date();
		//System.out.println(today);
		Date today=new Date();
		//java.sql.date
		SimpleDateFormat date=null;
		
		//yyyy->년도표현
		//MM->월
		//dd->일
		//hh->시간
		//mm->분
		//ss->초
		//a->오전/오후
		//2020.10.12.10:56
		date=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");
	
		String now=date.format(today);
		System.out.println(now);
	}

}
