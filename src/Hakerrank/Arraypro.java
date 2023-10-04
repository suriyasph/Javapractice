package Hakerrank;

public class Arraypro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			if (i != 0 && i != a.length)
				System.out.print(",");

			System.out.print(a[i]);
		}
		System.out.println("}");

	}

}
