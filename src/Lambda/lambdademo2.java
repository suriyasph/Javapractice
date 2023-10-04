package Lambda;
interface A
{
	void add(int a);
	
}
interface B
{
	void sub(int a,int b);
}
interface C
{
	int mul(int a,int b);
	
}
interface D
{
	int  div(int a,int b);
}
public class lambdademo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=a->{System.out.println(a);};
		ob.add(50);
		B ob1=(a,b)->{System.out.println(a-b);};
		ob1.sub(50,20);
		C ob2=(a,b)->{return a*b;};
		System.out.println(ob2.mul(20,65));
		D ob3=(a,b)->{return a/b;};
		System.out.println(ob3.div(50, 5));




	}

}
