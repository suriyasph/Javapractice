package collecpro;

import java.util.ArrayList;

public class employee {
	String name;
	int id;
	long mobile;

	employee(int id, String name, long mobile) {
		this.name = name;
		this.id = id;
		this.mobile = mobile;
	}

	static Boolean equal(employee ob, employee ob1) {
		if (ob.name.equals(ob1.name)) {
			if (ob.mobile == ob1.mobile)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<employee> ob = new ArrayList<>();
		ob.add(new employee(1, "suriya", 8122711516l));
		ob.add(new employee(2, "nandha", 84563217951l));
		ob.add(new employee(3, "thiyagu", 7200009924l));
		ArrayList<employee> ob1 = new ArrayList<>();
		ob1.add(new employee(1, "suriya", 8122711516l));
		ob1.add(new employee(2, "nandha", 84563217951l));
		ob1.add(new employee(3, "prakash", 9632484151l));
		ArrayList<employee> ob2 = new ArrayList<>();

		for (int i = 0; i < ob.size(); i++) {
			for (int j = 0; j < ob1.size(); j++) {
				Boolean boo=equal(ob.get(i), ob1.get(j));
				if (boo)
				{ 
					System.out.println(ob.get(i).name+" "+ob.get(i).id+" "+ob.get(i).mobile);
					ob2.add(ob.get(i));
					
			    }
		}
	}
		System.out.println("-------------------");

		for(employee e:ob2)
		{
			System.out.println(e.id+" "+e.name+" "+e.mobile);
		}
}
}
