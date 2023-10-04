package Encap;
import java.util.*;

public class student extends average
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int t,e,m,s,ss;
		System.out.println("Enter the tamil mark...");
		t=ob.nextInt();
		System.out.println("Enter the english mark...");
		e=ob.nextInt();
		System.out.println("Enter the maths mark...");
		m=ob.nextInt();
		System.out.println("Enter the science mark...");
		s=ob.nextInt();
		System.out.println("Enter the social mark...");
		ss=ob.nextInt();
		student st=new student();
		st.sett(t);
		st.sete(e);
		st.setm(m);
		st.sets(s);
		st.setss(ss);
		System.out.println("Tamil mark = "+st.gett());
		System.out.println("English mark = "+st.gete());
		System.out.println("Maths mark = "+st.getm());
		System.out.println("Science mark = "+st.gets());
		System.out.println("Social mark = "+st.getss());
		System.out.println("Average mark = "+st.getaverage()); 
		if(st.getc() == 5)
			System.out.println("Result is Pass");
		else
			System.out.println("Result is Fail");



	}

}
class average
{
	private int tamil,english,maths,science,social,average,c;
	void sett(int t)
	{
		tamil=t;
		grade(tamil);
	}
	void sete(int e)
	{
		english=e;
		grade(english);

	}
	void setm(int m)
	{
		maths=m;
		grade(maths);

	}
	void sets(int s)
	{
		science=s;
		grade(science);

	}
	void setss(int ss)
	{
		social=ss;
		grade(social);

	}
	int getaverage()
	{   
		average=(tamil+english+maths+science+social)/5;
		return average;
		
	}
	void grade(int mark)
	{
		if(mark>35)
			c++;
	}
	int gett()
	{
		return tamil;
	}
	int gete()
	{
		return english;
	}
	int getm()
	{
		return maths;
	}
	int gets()
	{
		return science;
	}
	int getss()
	{
		return social;
	}
	int getc()
	{
		return c;
	}
	
} 

