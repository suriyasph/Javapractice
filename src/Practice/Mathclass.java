package Practice;

public class Mathclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int a=10,b=-5;
	   System.out.println( Math.max(a,b));
	   char arr[]= {'1','2','5','4','5'};
	   String s="";
	   s=String.copyValueOf(arr);
	   System.out.println(s);
	   String s1=new String("Hello");
	   String s2="Hello";
	   String s3=s1.intern();
	   System.out.println(s1==s2);
	   System.out.println(s1==s3);
	   System.out.println(s2==s3);
	   System.out.println(Math.sqrt(25));
	   System.out.println(Math.cbrt(125));
	   System.out.println(Math.round(4545.151));
	   System.out.println(Math.round(5454654.5120));
	   System.out.println(Math.pow(4,5));
	   System.out.println(Math.abs(b));
	   System.out.println("Raja");
	}

}
