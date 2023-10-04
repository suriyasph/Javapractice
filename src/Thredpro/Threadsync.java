package Thredpro;

class securedclass {
	static synchronized void print(String s) {
		for (int i = 0; i < 5; i++) {
			System.out.println(s + "Nan " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}
	}
}

class thread1 extends Thread {
	securedclass ob;

	thread1(securedclass ob) {
		this.ob = ob;
	}

	 public void run() {
		ob.print("first");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class thread2 extends Thread {
	securedclass ob;

	thread2(securedclass ob) {
		this.ob = ob;
	}

	public void run() {
		ob.print("second");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class Threadsync {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		securedclass ob = new securedclass();
		securedclass ob1 = new securedclass();

		thread1 t1 = new thread1(ob1);
		thread1 t2 = new thread1(ob);
		thread2 t3 = new thread2(ob1);
		thread2 t4 = new thread2(ob);
		t1.start();
		t2.setPriority(7);
		t2.start();
		t3.start();
		t4.setPriority(10);
		t4.start();

	}

}
