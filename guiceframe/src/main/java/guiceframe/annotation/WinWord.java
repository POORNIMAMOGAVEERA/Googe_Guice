package guiceframe.annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import com.google.inject.BindingAnnotation;

@BindingAnnotation
@Target({ FIELD, PARAMETER, METHOD}) @Retention(RUNTIME)
public @interface WinWord {
   
}
//@BindingAnnotation - Marks annotation as binding annotation.
//@Target - Marks applicability of annotation.
//@Retention - Marks availablility of annotation as runtime.