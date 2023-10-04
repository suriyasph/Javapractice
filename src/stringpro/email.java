package stringpro;

public class email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m = "suriyasph@gmail.co.in";
		int i=0; char c=' ';
		for (i = 0; i < m.length(); i++) {
			 c = m.charAt(i);
			if (c == '.')
				break;
			else if (c != '@')
				System.out.print('*');
			else
				System.out.print(c);
			

		}
		for(int j=i;j<m.length();j++)
		{   c=m.charAt(j);
			 System.out.print(c);
		}
	}

}
