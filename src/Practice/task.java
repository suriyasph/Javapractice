package Practice;
//counting number of one in the array
public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int c = 0;

		for (int i = 0; i < n.length; i++) {
			int t=n[i];
			while (t > 0) {
				int r=t%10;
				if (r == 1)
				{
					c++;
				}
				t =t/ 10;

			}
		}
		System.out.println(c);
	}

}
 