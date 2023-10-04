package interview;

// import java.util.Scanner;

public class StringDuplicate {
	public static void main(String... argv) {
		String[] arr = { "a", "b", "c", "a", "b", "c", "a", "e" };
		/*
		 * Scanner scanner=new Scanner(System.in);
		 * System.out.println("Enter the array length..."); int
		 * length=scanner.nextInt(); scanner.nextLine(); String[] arr=new
		 * String[length]; for(int i=0;i<arr.length;i++) {
		 * System.out.println("Enter the value..."+ +i+"   ");
		 * arr[i]=scanner.nextLine(); }
		 */
		boolean vs[] = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (vs[i])
				continue;
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
					vs[j] = true;
				}
			}
			if (count % 2 != 0) {
				System.out.println(arr[i] + " " + count);
			}
		}
	}
}
