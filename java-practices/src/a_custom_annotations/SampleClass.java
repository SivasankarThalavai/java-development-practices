package a_custom_annotations;

@MyClassLevelAnnotation(authorName = "Sivasankar Thalavai", createdDate = "13/02/2021", lastModifiedDate = "13/02/2021", lastModifiedBy = "Sivasankar Thalavai", reviewers = {
		"Sarav", "Raj", "Raghul" })
@MyInheritedAnnotation
public class SampleClass {

	@MyMethodLevelAnnotation(orderValue = 10)
	public void printMessage() {
		System.out.println("hello annotation");
	}

}