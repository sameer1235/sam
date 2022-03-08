package sample;

public class Tcounter implements Runnable {
	public void run() {
		int i=0;
		while(i<=501) {
			try {
			i++;
			System.out.println(i);
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(500);
		if(i==500) {
			i=0;
		}} catch(Exception e) {
			e.printStackTrace();
		}
	}}
	public static void main(String[] args) {
		Tcounter t=new Tcounter();
		Thread t1= new Thread(t);
		Thread t2= new Thread(t);
		t1.start();
		t2.start();
	}

	

}
