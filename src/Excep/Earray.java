package Excep;

public class Earray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		try {
			for (int i = 0; i <= a.length; i++) {
				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
