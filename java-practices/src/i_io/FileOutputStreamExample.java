package i_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String args[]) {

		try {

			FileOutputStream fileOutputStream = new FileOutputStream(
					"D:\\thalasi\\git\\java-development-practices\\java-practices\\src\\i_io\\FileOutputStreamExample1.txt");
			fileOutputStream.write(65);

			FileOutputStream fout = new FileOutputStream(
					"D:\\thalasi\\git\\java-development-practices\\java-practices\\src\\i_io\\FileOutputStreamExample2.txt");
			String s = "Welcome to Java.";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);

			fileOutputStream.close();
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			FileInputStream fin = new FileInputStream(
					"D:\\thalasi\\git\\java-development-practices\\java-practices\\src\\i_io\\FileOutputStreamExample1.txt");
			int i = fin.read();
			System.out.println((char) i);

			FileInputStream fin1 = new FileInputStream(
					"D:\\thalasi\\git\\java-development-practices\\java-practices\\src\\i_io\\FileOutputStreamExample2.txt");
			int j = fin1.read();
			while (j != -1) {
				System.out.print((char) j);
				j = fin.read();
			}

			fin.close();
			fin1.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}