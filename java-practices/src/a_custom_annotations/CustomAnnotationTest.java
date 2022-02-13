package a_custom_annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;


public class CustomAnnotationTest {

	public static void main(String[] args)
			throws NoSuchMethodException, SecurityException, IllegalArgumentException, IllegalAccessException {

		// Class Level

		Class<SampleClass> sampleClassObj = SampleClass.class;

		if (sampleClassObj.isAnnotationPresent(MyClassLevelAnnotation.class)) {

			// can store this comments in log files to track Class Creations.

			Annotation annotation = sampleClassObj.getAnnotation(MyClassLevelAnnotation.class);
			MyClassLevelAnnotation cLevelAnnotation = (MyClassLevelAnnotation) annotation;

			System.out.println("*********************************************");
			System.out.println("Class Level Custom Annoation");
			System.out.println("*********************************************");
			System.out.println("Author Name : " + cLevelAnnotation.authorName());
			System.out.println("Created date : " + cLevelAnnotation.createdDate());
			System.out.println("Last Modified date : " + cLevelAnnotation.lastModifiedDate());
			System.out.println("Last Modified By : " + cLevelAnnotation.lastModifiedBy());
			System.out.println("Reviewers : " + Arrays.toString(cLevelAnnotation.reviewers()));
			System.out.println();

		}

		// Method Level

		SampleClass classObj = new SampleClass();
		Method methodRef = classObj.getClass().getMethod("printMessage");
		MyMethodLevelAnnotation mLevelAnnotaion = methodRef.getAnnotation(MyMethodLevelAnnotation.class);

		System.out.println("*********************************************");
		System.out.println("Method Level Custom Annoation");
		System.out.println("*********************************************");
		System.out.println("value is: " + mLevelAnnotaion.orderValue());
		System.out.println();

		
		// Field Level

		User user = new User();
		user.setEmail("sivasankar.thalavai.dev@gmail.com");
		user.setName("sivasankar");
		user.setId(112);
		user.setCreated(new Date());

		System.out.println("*********************************************");
		System.out.println("Field Level Custom Annoation");
		System.out.println("*********************************************");

		for (Field field : user.getClass().getDeclaredFields()) {
			MyFieldLevelAnnotation fLevelAnnotation = field.getAnnotation(MyFieldLevelAnnotation.class);
			System.out.println("field name: " + fLevelAnnotation.name());

			// changed the access to public
			field.setAccessible(true);
			Object value = field.get(user);
			
			System.out.println("field value: " + value);
			System.out.println("field type: " + fLevelAnnotation.type());
			System.out.println("is primary: " + fLevelAnnotation.isPrimaryKey());
			System.out.println();
		}

	}
}

/**********************************************
 * Class Level Custom Annoation
 *********************************************
 * Author Name : Sivasankar Thalavai Created date : 13/02/2021 Last Modified
 * date : 13/02/2021 Last Modified By : Sivasankar Thalavai Reviewers : [Sarav,
 * Raj, Raghul]
 *********************************************
 * 
 * Method Level Custom Annoation
 *********************************************
 * value is: 10
 *********************************************
 * 
 * Field Level Custom Annoation
 *********************************************
 * field name: id field value: 112 field type: class java.lang.Long is primary:
 * true
 * 
 * field name: name field value: sivasankar field type: class java.lang.String
 * is primary: false
 * 
 * field name: email field value: sivasankar.thalavai.dev@gmail.com field type:
 * class java.lang.String is primary: false
 * 
 * field name: created field value: Sun Feb 13 10:41:15 IST 2022 field type:
 * class java.util.Date is primary: false
 */
