package annotations;

import java.lang.reflect.Method;

public class TestHarnessKinda {
  public static void main(String[] args) throws Throwable {
    String className = "annotations.UnitUnderTest";
    Class<?> classObject = Class.forName(className);
    Method [] methods = classObject.getDeclaredMethods();
//    Method [] methods = classObject.getMethods();
    for (Method m : methods) {
      System.out.println(m);
      RunMe annot = m.getAnnotation(RunMe.class);
      if (annot != null) {
        System.out.println("Annotation found!!! name is " + annot.name());
      }
    }

  }
}
