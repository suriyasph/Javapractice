package Practice;

public class object 
{
  int a=10;
  void show()
  {
	 object ob= new object();
	 a=20;
	 System.out.println(ob.a);
	 System.out.println(a);
  }
  public static void main(String s[])
  {
	  object ob =new object();
	  ob.show();
  }
}
