package Practice;

public class keyword 
{
	String name;
	void get(String name)
	{
		this.name =name;
		System.out.println(name);
	}
        public static void main(String a[])
        {
        keyword k =new keyword();
        k.get("suriya");
        System.out.println(k.name);
        }     
}
