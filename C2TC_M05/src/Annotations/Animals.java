package Annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Animals {
	String name() default "Lion";
	int legs() default 4;
	String[] food() default{"Dogs","Cat","elephant","Fox"};

}
