package Practice;

public class stringfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Suriya  ";
		String s2 = "Prakash";
		char[] ch = new char[7];
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.charAt(2));// 1
		System.out.println(s1.isEmpty());// 2
		System.out.println(s1.isBlank());// 3
		System.out.println(s1.length());// 4
		System.out.println(s1.indexOf("Y"));// 5
		System.out.println(s1.trim());// 6
		System.out.println(s1.toLowerCase());// 7
		System.out.println(s1.toUpperCase());// 8
		System.out.println(s1.equals(s2));// 9
		System.out.println(s1.lastIndexOf("a"));// 10
		System.out.println(s1.substring(2));// 11
		System.out.println(s2.substring(2, 7));// 12
		System.out.println(s1.concat(s2));// 13
		System.out.println(ch = s2.toCharArray());// 14
		System.out.println(ch[5]);
		int s=5;
		int p=4;
		System.out.println(s );
		
		
	}

}
