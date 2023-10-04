package Hakerrank;

class First extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("HI");

			try {
				sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Second extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("HELLO");

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

public class Multi {

	final public static void main(String[] args) {
		First S1 = new First();
		Second S2 = new Second();
		System.out.println(S1.getState());
		S1.start();
		System.out.println(S1.getState());
		S2.start();
		S2.setPriority(10);
		main();
		
	}static void main()
	{
		System.out.println("suriya");
	}

}
