package Thredpro;
class first extends Thread{
	public void run()
    {
   	 System.out.println("hi");
   	 try {
   	 sleep(1000);
   	 }
   	 catch(InterruptedException e){
   		 System.out.println(e);
   		 
   	 }
   	
    }

}
class second extends Thread{
   public  void run()
    {
   	 System.out.println("hello");
   	 Thread.yield();	

    }
}	
class third extends Thread
{
	public void run ()
    {
   	 System.out.println("hey");
   	 
    }
	}
public class Threaddemo {    
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       first f=new first();
       third t=new third();
       t.start();
       t.join();
       f.start();
       
       

	}

}
