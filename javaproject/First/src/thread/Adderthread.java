package thread;

public class  Adderthread extends Sum implements Runnable {
	
	int start;
	int end;
	
	public Adderthread(int n1,int n2){
		start=n1;
		end=n2;
	}

	public void run() {
		for(int i=start;i<end;i++) {
	addNum(i);
	
		} 
		
	}
}
