package stringpro;


public class practicepro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Apple IS A Fruit111151 ";
		for(int i=0;i<s.length();i++)
		{    int ch=s.charAt(i);
			if( (ch>=65 & ch<=90))
			{
		     ch=ch+32;
			 System.out.print((char)(ch));
			}
			else if(ch>=97 &  ch<=122 | ch==' ' )
			{
		    System.out.print((char)(ch));

			}
				
		}
		

	}

}
