package Thredpro;

class govalu implements Runnable {
	public void run() {
		System.out.println("govaluuu");
		try {	Thread.sleep(2000);} catch (Exception e) {	System.out.println(e);}
}
}

class nesamani implements Runnable {
	public void run() {
		System.out.println("neasmani");
		try {	Thread.sleep(2000);} catch (Exception e) {	System.out.println(e);}


	}
}

class kisinamoorthy implements Runnable {
	public void run() {
		System.out.println("kisinamorthy");
		try {	Thread.sleep(2000);} catch (Exception e) {	System.out.println(e);}


	}
}

class aravind implements Runnable {
	public void run() {

		System.out.println("aravind");
		try {	Thread.sleep(2000);} catch (Exception e) {	System.out.println(e);}


	}
}

class chandhru implements Runnable {
	public void run() {
		System.out.println("chandhru");
		try {	Thread.sleep(2000);} catch (Exception e) {	System.out.println(e);}


	}
}

public class mainthread {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		govalu g = new govalu();
		nesamani n = new nesamani();
		kisinamoorthy k = new kisinamoorthy();
		aravind a = new aravind();
		chandhru c = new chandhru();
		for(int i=1;i<5;i++) {

		Thread t1 = new Thread(g);
		Thread t2 = new Thread(n);
		Thread t3 = new Thread(k);
		Thread t4 = new Thread(a);
		Thread t5 = new Thread(c);

		t1.setName("govalu");
		t2.setName("neasamni");
		t3.setName("kisinamoorthy");
		t3.setName("aravind");
		t3.setName("chanthru");

		t1.start();
		t1.join();
		t2.start();
		t3.start();
		t2.join();
		t3.join();
		t4.start();
		t5.start();
		t4.join();
		t4.join();
}

	}

}
