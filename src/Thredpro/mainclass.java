package Thredpro;
class normal extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("normal  "+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}
class deamonthread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Deamon  "+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class mainclass {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		normal n=new normal();
		deamonthread d=new deamonthread();
		d.setDaemon(true);
		d.start();
		n.start();
		

	}

}
