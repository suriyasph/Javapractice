package collecpro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class First {
	String name;
	int id;
	int salary;
	String designation;
	String department;
	String division;

	public First(String name,int salary, String designation, String department, String division) {
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.department = department;
		this.division = division;
	}

	public First(int id, String department, String division) {
		this.id = id;
		this.department = department;
		this.division = division;
	}

	public First(String name,int id, int salary, String designation) {
		this.name = name;
		this.id=id;
		this.salary = salary;
		this.designation = designation;
	}
	public String toString()
	{
		return name+" " +salary+" "+designation+" "+department+" "+division;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<First> empobj = new ArrayList<>();
		empobj.add(new First("Suriya",1, 28000, "Junior Engineer"));
		empobj.add(new First("Vikram",2, 32000, "Senior  Enginner"));
		empobj.add(new First("Saran", 3,32000, "Senior  Engineer"));
		empobj.add(new First("Rakesh",4, 28000, "Junior  Engineer"));
		empobj.add(new First("Thiagu",5,28000, "Junior  Engineer"));
		empobj.add(new First("Sunil",6, 16000, "Gradute Trainee"));
		empobj.add(new First("Vignesh",7, 35000, "Team leader"));
		empobj.add(new First("Udhaya",8, 17000, " Engineer Trainee"));
		empobj.add(new First("Monaj",9,17000, " Engineer Trainee"));
		empobj.add(new First("Bharath",10, 40000, "Assintant Manager"));
		empobj.add(new First("Sukumar",11, 55000, "Manager"));
		empobj.add(new First("Nagaraj",12, 17000, " Engineer Trainee"));
		empobj.add(new First("Bala",13, 17000, " Engineer Trainee"));
		empobj.add(new First("Gokul",14, 15000, " Graduate Trainee"));
		empobj.add(new First("Suresh",15, 15000, "Graduate Trainee"));
		empobj.add(new First("Prakash",16, 16000, "Gradute Trainee"));
		for(First i:empobj)
		System.out.println(i.id+i.name+i.salary+i.designation);
		ArrayList<First> empobj2 = new ArrayList<>();
		empobj2.add(new First(1, "Qulity Assurance", "LapGDC"));
		empobj2.add(new First(2, "Qulity Assurance", "LaPTW"));
		empobj2.add(new First(3,"Production", "LapGDC"));
		empobj2.add(new First(4,"Production", "LapTW"));
		empobj2.add(new First(5,"Qulity Control", "LapTW"));
		empobj2.add(new First(6,"Qulity Control", "LapGDC"));
		empobj2.add(new First(7,"Qulity Assurance", "LapGDC"));
		empobj2.add(new First(8,"Qulity Assurance", "LapGDC"));
		empobj2.add(new First(9,"Qulity Assurance", "LapTW"));
		empobj2.add(new First(10,"Production", "LapTW"));
		empobj2.add(new First(11,"Qulity Assurance", "LapGDC"));
		empobj2.add(new First(12,"Production", "LapGDC"));
		empobj2.add(new First(13,"Quality Control", "LapTW"));
		empobj2.add(new First(14,"Production", "LapGdc"));
		empobj2.add(new First(15,"Production", "LapTW"));
		empobj2.add(new First(16,"Production", "LapTW"));
		for(First i:empobj2)
			System.out.println(i.id+i.department+i.division);
		
		HashMap<Integer ,First> hmap = new HashMap<Integer, First>();
		for(First i:empobj)
		{
			for(First j:empobj2)
			{
				if(i.id ==j.id)
				{
					hmap.put(i.id,new First(i.name,i.salary,i.designation,j.department,j.division) );
				}
			}

		}
		for(Map.Entry<Integer,First > i:hmap.entrySet())
		{
			System.out.println(i.getValue());
		}
       System.out.println(hmap.get(1));

	}

}
