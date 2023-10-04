package arr;

public class arrayz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 0, 3, 4, 0, 7, 0, 5, 0,0,0 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}

		}
		
			for (int k = 0; k < a.length; k++) {
				if (a[0] == 0) {
					int f = a[0], i ;
					for (i=0 ; i < a.length-1 ; i++) {
						a[i] = a[i + 1];
					}
					a[i] = f;

				}
			}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
