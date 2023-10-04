package stringpro;

public class task {
	task() {
		task8();
	}

	void task1() {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));

	}

	void task3() {
		String s = "Hi, my name is \"suriya\"";
		System.out.println(s);
	}

	void task4() {
		String s = "java is a programming language";
		String[] a = s.split(" ");
		/*
		 * for(int i=0;i<a.length;i++) System.out.println(a[i]);
		 */
		int l = a[0].length(), k = 0;
		for (int i = 1; i < a.length; i++)
			if (l < a[i].length()) {
				l = a[i].length();
				k = i;
			}

		System.out.print(a[k]);

	}

	void task5() {
		int a[] = { 3, 5, 2, 6, 7 };
		int b[] = new int[a.length];
		int j = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			b[j] = a[i];
			j++;

		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);

		}
	}

	void task6() {
		int a[] = { 2, 4, 2, 5, 6, 4, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = 0;

				}

			}
		}

		for (int i = 0; i < a.length; i++)

			System.out.println(a[i]);

	}

	void task7() {
		String s = "madam";
		char s1[] = s.toCharArray();
		char[] p = new char[s.length()];	
		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {

			p[j] = s1[i];
			j++;
		}

		System.out.println(s);
		String p1 = new String(p);
		System.out.println(p);

		if (s.equals(p1)) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not a palindrome");

	} 

	void task8() {
		String s = "hello how are you";
		String[] s2 = s.split(" ");
		for (int i = s2.length - 1; i >= 0; i--)
			System.out.print(s2[i] + " ");
	}

	void task9() {
		int a[] = { 0, 2, 4, 0, 6, 0, 0 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				a[i] = 5;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	void task10() {
		String s = "terrorist";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'r') {
				c = 'd';
				System.out.print(c);
			} else
				System.out.print(c);
		}
	}

	void task11() {
		String s = "adifd";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			for (int j = 0; j < 2; j++) {
				if (i < s.length() - 1)
					System.out.print(++c);
				else
					System.out.print(--c);
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task t = new task();

	}

}
