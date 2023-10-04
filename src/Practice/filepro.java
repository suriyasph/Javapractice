package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class filepro {
	static void createfolder() throws IOException {
		File f = new File("D:\\Suriya\\Letter");
		System.out.println(f.mkdirs());
	}

	static void createfile() throws IOException {
		File f1 = new File("D:\\Suriya\\Letter\\offer.txt");
		System.out.println(f1.createNewFile());
	}
   static void  writefile() throws IOException
   {
	   FileWriter fw=new FileWriter("D:\\Suriya\\Letter\\offer.txt");
	   fw.write("sdjb  sfbkbf kjbfkbf ksjabjb fjfbkjbf jbfbjssbbfbb");
	   fw.write("\nfbjfbjhb fvkjbfkbf  djfbsjdbf lskfskbf djfb");
	   fw.close();
   }
   static void filereaderclass() throws Exception {

		FileReader n1 = new FileReader("D:\\Suriya\\Letter\\offer.txt");
		int i = 0;
		while ((i = n1.read()) != -1) {

			System.out.print((char) i);

		}
System.out.println();
	}
   static void scaclass() throws FileNotFoundException
   {
	FileReader n1 = new FileReader("D:\\Suriya\\Letter\\offer.txt");

	   Scanner ob=new Scanner(n1);
	   while(ob.hasNext())
	   {
		   System.out.println(ob.nextLine());
	   }
	   
   }

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		createfolder();
		createfile();
		writefile();
		filereaderclass();
		scaclass();
	}
 
}
