package Thredpro;

class Gameloding extends Thread {

	public void run() {
		System.out.print("Iru da varen");
		for (int i = 0; i < 5; i++) {
			System.out.print(".");

			try {
				sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}

		}
		System.out.println();
	}
}

class Gameflying extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Naan thalaikizhaga than kuthipan " + i);
			try {
				sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}
}

class Gamelanging extends Thread {

	public void run() {
		try {
			sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("itho vanthutan");

	}
}

class Gamerunning extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("odu da odu");
			try {
				sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Gameshotting extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("sudu sudu sudu sudu sudu dandanaka dandanaka");

			try {
				sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Gamedead extends Thread {

	public void run() {
		try {
			sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Varataaa mamae");
	}
}

public class Gamemain {

	public static void main(String[] args) throws InterruptedException {
		Gameloding n = new Gameloding();
		Gameflying n2 = new Gameflying();
		Gamelanging n3 = new Gamelanging();
		Gamerunning n4 = new Gamerunning();
		Gameshotting n5 = new Gameshotting();
		Gamedead n6 = new Gamedead();

		System.out.println("Arambikalaama");
		n.start();
		n.join();
		n2.start();
		n2.join();
		n3.start();
		n3.join();
		n4.start();
		n5.start();
		n4.join();
		n5.join();
		n6.start();

	}

}
