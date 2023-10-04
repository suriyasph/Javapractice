package Hakerrank;
import java.util.*;

public class anagram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1=scan.next().toLowerCase();
		System.out.println("Enter the second string");
		String s2=scan.next().toLowerCase();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		//System.out.println(c1);
		//System.out.println(c2);
		s1=String.copyValueOf(c1);
		s2=String.copyValueOf(c2);
		if(s1.equals(s2))
		{
			System.out.println("String is angram");
		}
		else 
			System.out.println("String is not anagram");


	}

}
