package interview;

//find the palindrome numbers between 100 and 200 whose sum of dighits is 9
public class Palindrome {
	public static void main(String[] arg) {
		for (int i = 100; i <= 200; i++) {
			int n = i;
			int rev = 0;
			while (n > 0) {
				int t = n % 10;
				rev = (rev * 10) + t;
				n /= 10;
			}
			int sum = 0;
			if (rev == i)
				//System.out.println(i);
			{
				while (rev > 0) {
					int t = rev % 10;
					sum = sum + t;
					rev = rev / 10;

				}
				// System.out.println(sum);
				if (sum == 9)
					System.out.println(i);

			}
		}
	}
}
