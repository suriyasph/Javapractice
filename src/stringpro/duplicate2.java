package stringpro;

public class duplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "anagram".toLowerCase();
		String n2="marganaa".toLowerCase();
		System.out.println(n);
		System.out.println(n2);
		
		int c = 0,c1=0,co=0;
		for (char i = 'a'; i <= 'z'; i++) {
			for (int j = 0; j < n.length(); j++) {
				if (i == n.charAt(j)) {
					c++;
				}
			}
			for (int k = 0; k < n2.length(); k++) {
				if (i == n2.charAt(k)) {
					c1++;
				}
				
				
			}
			System.out.println(i+" "+c1+" " +c);
			if(c>0)
			if(c==c1)
			{
				co++;
			}

			c=0;c1=0;

			}						System.out.println(co);


			
			c = 0;c1=0;
		}
	}


