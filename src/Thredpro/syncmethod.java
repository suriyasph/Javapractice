package Thredpro;
class prints {
	public synchronized void printsm(int v) throws InterruptedException
	{
		for(int i=0;i<5;i++) {
			System.out.println(v);
		Thread.sleep(1000);
		}
	}
}
class fclass extends Thread
{
	prints a;
	fclass(prints a){
		this.a=a;
	}
	public void run()
	{
		try {
			a.printsm(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

class sclass extends Thread
{
	prints a;
	sclass(prints a){
		this.a=a;
	}
	public void run()
	{
		try {
			a.printsm(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

public class syncmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prints a=new prints();
		fclass f=new fclass(a);
		sclass s=new sclass(a);
		f.start();
		s.start();

	}

}
