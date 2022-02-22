package c_collections.list;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationDeSerializationDemo {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");

		try {

			// Serialization
			fos = new FileOutputStream("classpath:file.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(al);

			// Deserialization
			fis = new FileInputStream("file");
			ois = new ObjectInputStream(fis);

			ArrayList<?> list = (ArrayList<?>) ois.readObject();
			System.out.println(list);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			fos.close();
			oos.close();
		}
	}

}
