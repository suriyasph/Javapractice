package Thredpro;

class pr {
	
	public void printf(int v) throws InterruptedException {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				if(i==3)
				{
					wait();
				}
			
				System.out.println(v);
			}

		};
		
	}
}

class f extends Thread {
	pr a;

	f(pr a) {
		this.a = a;
	}

	public void run() {
		try {
			a.printf(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class s extends Thread{
	pr a;
	s(pr a)
	{
		this.a=a;
	}
	public void run()
	{
		try {
			a.printf(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class syncblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr a=new pr();
		f ob=new f(a);
		s ob1=new s(a);
		ob.start();
		ob1.start();
		

	}

}
