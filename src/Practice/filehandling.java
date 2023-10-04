package Practice;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
 
public class filehandling {

	static void foldercreate() {

		File n = new File("C:\\Uniq\\java\\FSD\\16");
		System.out.println(n.mkdirs());

	}

	static void filecreation() throws IOException {

		File n1 = new File("C:\\Uniq\\java\\FSD\\16\\Offerletter.txt");
		System.out.println(n1.createNewFile());
		System.out.println(n1.getName());
		System.out.println(n1.length());
		System.out.println(n1.canRead());
		System.out.println(n1.canWrite());
		System.out.println(n1.getAbsolutePath());

	}

	static void filewriter() throws FileNotFoundException, IOException {

		FileWriter n1 = new FileWriter("C:\\\\Uniq\\\\java\\\\FSD\\\\16\\\\Offerletter.txt");
		n1.write("Vinitha Sakthivel selected in ZOHO with package of 2000000");
		n1.write("\nSorry your package is changed by 3000000");
		n1.flush();
		n1.close();

	}

	static void fileread() throws FileNotFoundException {

		File n1 = new File("C:\\\\Uniq\\\\java\\\\FSD\\\\16\\\\Offerletter.txt");
		Scanner s1 = new Scanner(n1);
		while (s1.hasNextLine()) {

			System.out.println(s1.nextLine());

		}
	}

	static void filereaderclass() throws Exception {

		FileReader n1 = new FileReader("C:\\Uniq\\java\\FSD\\16\\Offerletter.txt");
		int i = 0;
		while ((i = n1.read()) != -1) {

			System.out.print((char) i);

		}

	}

	static void filedelete() {

		File n1 = new File("C:\\Uniq\\java\\FSD\\16\\Offerletter.txt");

		n1.delete();



	}

	public static void main(String[] args) throws Exception {

		foldercreate();

		try {

			filecreation();
		} catch (Exception e) {

			System.out.println(e);

		}

		try {

			filewriter();

		}

		catch (FileNotFoundException e) {

			System.out.println(e);

		}

		try {

			fileread();

		}

		catch (FileNotFoundException e) {

			System.out.println(e);

		}

		System.out.print("---------------------------------------");

		System.out.println();

		try {

			filereaderclass();

		}

		catch (Exception e) {

			System.out.println(e);

		}

		filedelete();

		System.out.println("Normal Flow");
		

	}

}
