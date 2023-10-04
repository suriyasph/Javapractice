package Java8;
@FunctionalInterface
interface ademo{
	void met();
}
@FunctionalInterface
interface bdemo{
	void se(int a, int b);
}
public class Instancemethodref {
             void me()
             {
            	 System.out.println("Hello");
             }
             void me(int a,int b)
             {
            	 System.out.println(a+b);
             }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instancemethodref ob=new Instancemethodref();
		ademo obj=ob::me;
		obj.met();
		bdemo obj2=ob::me;
		obj2.se(50, 60);

	}
}
