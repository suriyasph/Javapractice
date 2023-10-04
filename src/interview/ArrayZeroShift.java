package interview;

public class ArrayZeroShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 0, 8, 0, 3, 4, 5, 0, 8, 6, 7, 0 };
		int elementindex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[elementindex] = a[i];
				elementindex++;
			}
		}

		while (elementindex < a.length) {
			a[elementindex] = 0;
			elementindex++;
		}

		for (int ele : a) {
			System.out.println(ele);
		}

	}

}
