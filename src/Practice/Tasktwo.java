package Practice;
import java.util.Scanner;

public class Tasktwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in); 
		System.out.println("Enter the size of array");
		int size= scanner.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element...");
			array[i]=scanner.nextInt();
		}
		for(int s:array)
			System.out.print(s+" ");
		for(int i=0;i<size;i++)
		{   for(int j=i+1;j<size;j++)
		{
			if(array[i]>array[j])
			{
				int t=array[i];
				array[i]=array[j];
				array[j]=t;
			}
		}
		}
		System.out.println("--------------------");
		for(int s:array)
			System.out.println(s);

	}

}
