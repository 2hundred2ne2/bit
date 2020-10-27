package thread;

public class AdderThread2 {

	public static void main(String[] args) {
		Sum sum=new Sum();
		AdderThread1 t1=new AdderThread1(sum, 1, 50);
		AdderThread1 t2=new AdderThread1(sum, 51, 100);
		t1.start();
		t2.start();
		try {
			e.join();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("1~100합:"+sum.getNum());
		
	}

}
