package arr;

public class duplicate {
	public static void main(String ra[]) {
		int a[] = { 4, 6, 3, 5, 0, -1, 6, 4, 5 };
		int t = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					t = a[j];
					System.out.println(t);
				}
			}
		}
	}
}
