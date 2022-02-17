package i_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String args[]) throws Exception {

		FileOutputStream fout = new FileOutputStream(
				"D:\\thalasi\\git\\java-development-practices\\java-practices\\src\\i_io\\BufferedOutputStreamExample1.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Welcome to java.";
		byte b[] = s.getBytes();
		bout.write(b);

		bout.flush();
		bout.close();
		fout.close();

		System.out.println("success");

		try {
			FileInputStream fin = new FileInputStream(
					"D:\\thalasi\\git\\java-development-practices\\java-practices\\src\\i_io\\BufferedOutputStreamExample1.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
			bin.close();
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}