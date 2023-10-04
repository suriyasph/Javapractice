package arr;

public class Arraytranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},
					  {4,5,6,7},
					  {2,7,8,9}};
		int arr2[][]= new int[arr[0].length][arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		System.out.println("-------------------------");

		 
		 for(int i=0;i<arr[0].length;i++) { 
			 for(int j=0;j<arr.length;j++)
			 {
				 arr2[i][j]=arr[j][i];
		       System.out.print(arr[j][i]);
			 }
			 System.out.println();
		
	}
		 System.out.println("-------------------------");
		 for(int i=0;i<arr2.length;i++)
			{
				for(int j=0;j<arr2[0].length;j++)
				{
					System.out.print(arr2[i][j]);
					
				}
				System.out.println();
			}
}
}
