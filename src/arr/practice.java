package arr;

public class practice {

	void frequency(int arr[]) {

		int b[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			b[i] = arr[i];
		}
		for (int i = 0; i < b.length; i++) {
			int c = 0, v = 0465461;
			for (int j = 0; j < b.length; j++) {
				if (arr[i] == b[j]) {
					c++;
					b[j] = v;
				}
			}
			if (c > 0)
				System.out.println(arr[i] + "=" + c);
		}

	}

	void left(int arr[], int n) {
		for (int k = 0; k < n; k++) {

			int f = arr[0], i = 0;
			for (i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[i] = f;

		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
		}
	}

	void arrayswap(int arr[]) {
		for (int k = 0; k < 1; k += 2) {

			int f = arr[k], i = 0;
			System.out.println(arr[k]);
			for (i = k; i < arr.length - 1; i++) {
				arr[k] = arr[arr.length - 1 - k];
				arr[k + 2] = arr[k + 1];
				arr[k + 1] = arr[k];

			}
			arr[arr.length - 1] = arr[arr.length - 1 - i];

		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
		}
	}
	void swaparr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 6, 8, 2, 4, 7 ,1,3,6,5,5};
		practice ob = new practice();
		ob.frequency(arr);
	}

}
