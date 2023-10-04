
package inher;
class Shape
{
	public void sh()
	{
		System.out.println("This is shape");
	}
}
class Rectangle extends Shape
{
	public void re()
	{
		System.out.println("This is Rectangle");
	}
}
class Circle extends Shape
{
	public void cr()
	{
		System.out.println("This is circle");
	}
}
class Square extends Rectangle
{
	public void sq()
	{
		System.out.println("Square is rectangle");
	}
}
	
public class A 
{ 
	public  static void main(String args[])
	{
		Square s= new Square();
		s.sh();
     	s.re();
	}

}




