package stringpro;

public class stringprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love my family and friends";
		for(int i=0;i<s.length();i++)
		{    if(s.charAt(i)=='f')
		{
			for(int j=i;j<s.length();j++)
			{
				if(s.charAt(j)==' ')
					break;
				System.out.print(s.charAt(j));
				i=j;
			}
		System.out.println();
		}
		}

	}

}
