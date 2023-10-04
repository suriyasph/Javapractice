package Thredpro;

class Fsd17 {
	public void threadcls() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Fsd 17 class thread class going to" + i + " ...");
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
			}
		}
	}
}

class Fsd16 {
	public void threadcls() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Fsd 17 class thread class going to " + " 1" + " ...");
		}
	}
}

public class Threadtask {
	public static void main(String[] args) {
		Fsd17 obj = new Fsd17();
		obj.threadcls();
		Fsd16 ob = new Fsd16();
		ob.threadcls();
	}
}