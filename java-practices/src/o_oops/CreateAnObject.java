package o_oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreateAnObject implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name = "siva";
	private String college = "gvn";

	public CreateAnObject() {
		super();
	}

	public CreateAnObject(String name, String college) {
		super();
		this.name = name;
		this.college = college;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "CreateAnObject [name=" + name + ", college=" + college + "]";
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// 1. using new Keyword
		System.out.println("1. using new Keyword");
		CreateAnObject obj1 = new CreateAnObject("siva", "gvn");
		CreateAnObject obj2 = new CreateAnObject("raj", "sae");

		System.out.println(obj1.toString());
		System.out.println(obj2.toString());

		// 2. Using newInstance() method of Class class
		System.out.println("2. Using newInstance() method of Class class");
		try {
			String className = "o_oops.CreateAnObject";
			Class<?> clasz = Class.forName(className);
			CreateAnObject obj3 = (CreateAnObject) clasz.newInstance();
			System.out.println(obj3.getName());
			System.out.println(obj3.getCollege());
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 3. Using newInstance() method of Constructor class
		System.out.println("3. Using newInstance() method of Constructor class");
		Constructor<CreateAnObject> constructor;
		try {
			constructor = CreateAnObject.class.getConstructor();
			CreateAnObject obj4 = constructor.newInstance();
			System.out.println(obj4.getName());
			System.out.println(obj4.getCollege());
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		// 4. Using Object Deserialization
		// In this approach, we will be using Serializable interface in java which is a
		// marker interface(method with no body) for serializing a Java Student Object
		// s1 into a text file (sample.txt) and using object deserialization we will be
		// reading and assigning it to a new Student object s2.

		// Path to store the Serialized object
		System.out.println("4. Using Object Deserialization");
		String filePath = "sample.txt";
		try {

			FileOutputStream fileOutputStream = new FileOutputStream(filePath);
			ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
			outputStream.writeObject(obj1);
			outputStream.flush();
			outputStream.close();

			FileInputStream fileInputStream = new FileInputStream(filePath);
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			CreateAnObject s2 = (CreateAnObject) inputStream.readObject();

			inputStream.close();

			System.out.println(s2.getName());
			System.out.println(s2.getCollege());

		} catch (Exception ee) {
			ee.printStackTrace();
		}

		// 5. Using Object Cloning – clone() method
		System.out.println("5. Using Object Cloning – clone() method");
		try {
			CreateAnObject clonedObj = (CreateAnObject) obj1.clone();
			System.out.println(clonedObj.getName());
			System.out.println(clonedObj.getCollege());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		

	}

}
