package a_custom_annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface MyClassLevelAnnotation {

	String authorName();

	String createdDate();

	String lastModifiedDate() default "N/A";

	String lastModifiedBy() default "N/A";

	String[] reviewers();
}

/*
 * 
 * @Target tag is used to specify at which type, the annotation is used.
 * 
 * @Retention annotation is used to specify to what level annotation will be available.
 * 
 * By default, annotations are not inherited to subclasses. 
 * 
 * The @Inherited annotation marks the annotation to be inherited to subclasses.
 * 
 * The @Documented Marks the annotation for inclusion in the documentation.
 *  
 * ElementType.ANNOTATION_TYPE can be applied to an annotation type.
 * ElementType.CONSTRUCTOR can be applied to a constructor. ElementType.FIELD
 * can be applied to a field or property. ElementType.LOCAL_VARIABLE can be
 * applied to a local variable. ElementType.METHOD can be applied to a
 * method-level annotation. ElementType.PACKAGE can be applied to a package
 * declaration. 
 * ElementType.PARAMETER can be applied to the parameters of a
 * method. 
 * ElementType.TYPE can be applied to any element of a class / interface / enumeration.
 */