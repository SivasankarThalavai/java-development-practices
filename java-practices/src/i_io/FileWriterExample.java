package i_io;

import java.io.FileWriter;

public class FileWriterExample {
	
	public static void main(String args[]) {
		try {
			FileWriter fw = new FileWriter(
					"D:\\thalasi\\git\\java-development-practices\\java-practices\\src\\i_io\\FileWriterExample1.txt");
			fw.write("Welcome to java.");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Success...");
	}
	
}