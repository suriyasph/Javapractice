package Hakerrank;


	
public class suriya
{    
public static void main(String []args)
{
	String s="Apple IS  a fruit ";
	StringBuffer h = new StringBuffer();
	for(int i=0;i<s.length();i++)
	{    int ch=s.charAt(i);
		if( (ch>=65 &&  ch<=90))
		{
	     ch=ch+32;
	     h.append((char)ch);
		 System.out.print((char)ch);
		}
		else if (ch>=97 &&  ch<=122)
		{
		ch=ch-32;
	     h.append((char)ch);
	    System.out.print((char)ch);

		}
	}
	System.out.println();
	System.out.println(h);
	int $hv_=5;
	System.out.println($hv_);

}

}