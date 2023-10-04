package Thredpro;

class running extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Running");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class shooting extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Shooting");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class loading extends Thread {
	public void run() {
		System.out.print("Loading");

		for (int i = 0; i < 3; i++) {
			System.out.print(".");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class game {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
		running r = new running();
		shooting s = new shooting();
		loading l = new loading();
		r.start();
		s.start();
		r.join();
		s.join();
		l.start();
		} 
	}

}
