package cons;

public class student 
{
	private String name,dept;
	private long phone;
	student(String name,String dept,long phone)
	{
	  this.name=name;
	  this.dept=dept;
	  this.phone=phone;
	  get();
	}
	void get()
	{
		System.out.println(name+ " "+dept +" "+phone);
	}
    
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		student s=new student("suriya","mech",8122711516L);
		

	}

}
