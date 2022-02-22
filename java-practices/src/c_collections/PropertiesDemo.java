package c_collections;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*	If you change the value in the properties file,you don'tneed to recompile the java class.So,
 * 	it makes the application easy to manage.
 * 	It is used to store information which is to be changed frequently.
*/
public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader(
				"D:\\thalasi\\git\\java-development-practices\\java-practices\\src\\c_collections\\db.properties");

		Properties p = new Properties();
		p.load(reader);

		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	}

}
