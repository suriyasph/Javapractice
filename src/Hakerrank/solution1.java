package Hakerrank;

 
public class solution1 {
	public static void main(String[] argv) {
		String s = "MOVE TO YOU";
		String s1 = "";
		int co = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				s1 = s1 + '#';
				co++;
			} else {
				s1 += c;
			}

		}
		System.out.println(s1);
		for(int i=0;i<co;i++)
			
		{
			System.out.print("#");
		}
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c == '#') {
				System.out.print(" ");
			
			} else {
				System.out.print(c);
			}

		}
	}
}
