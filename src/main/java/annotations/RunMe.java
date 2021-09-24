package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @ interface RunMe {
  // interfaces can have psf type "constants"
//  public static final int x = 100; // public static final
//  conventionally, NO SPACE!!!
//public @interface RunMe {
  // elements must be one of:
  // primitives
  // String
  // Class
  // Another annotation -- but NO CIRCULAR references
  // arrays of the ABOVE
  String name() default "Unknown";
  int value();
}

