package interview;

public class Arraytask {
	public static void main(String[] sa) {
		int a[] = { 10, 20, 60, 90,5};
		int i = 0, j = 0;
		for (i = 0; i < a.length - 1; i++) {
			int sum = 0;
			for (j = i + 1; j < a.length; j++) {
				sum = a[i] + a[j];
				if (sum == 25 || (sum >= 20 && sum <= 30)) {
					System.out.println(i + " " + j);
				}

			}

		}
	}
}
