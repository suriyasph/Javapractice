package arr;

import java.util.*;

public class marray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marray m = new marray();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the  row size..");
		int r = s.nextInt();
		System.out.println("Enter the colomn size..");
		int c = s.nextInt();
		int ar[][] = new int[r][c];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.println("Enter the value " + i + j);
				ar[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < ar.length; i++) {
			int n = 2;
			for (int j = 0; j <   ar[i].length; j++) {

				System.out.print(ar[i][j] + "," + n + "  ");
				n += 2;

			}
			System.out.println();
		}
	}

}
