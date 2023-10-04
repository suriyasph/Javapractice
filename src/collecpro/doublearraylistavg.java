package collecpro;
import java.util.*;

public class doublearraylistavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> dou=new ArrayList<>();
		for(double i=465.121;i<948.5151;i+=15.23)
		{
			dou.add(i);
		}
System.out.println(dou);
double sum=0;
for(int i=0;i<dou.size();i++)
{
	sum+=dou.get(i).doubleValue();
	}
System.out.println(sum);
System.out.println("Average of double list");
System.out.println(sum/dou.size());
	
	}

}
