package Thredpro;

 class printmethod {
	static public synchronized void printsm(int v) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println(v);
			Thread.sleep(1000);
		}
	}
}

class fmethod extends Thread {

	public void run() {
		try {
			printmethod.printsm(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
class smethod extends Thread {

		public void run() {

			try {
				printmethod.printsm(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

public class syncstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fmethod f=new fmethod();
		smethod s=new smethod();
		f.start();
		s.start();



}
}