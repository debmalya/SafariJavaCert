package initialization;

public class ClassInitialization {
  static int x;
  static {
    System.out.println("x is " + x);
    x = 99;
  }
  static int y = getYValue();
  static {
    System.out.println("x is now " + x + " y is " + y);
  }

  static int getYValue() {
    System.out.println("getting y value");
    return 100;
  }
}

class UseInit {
  public static void main(String[] args) {
    ClassInitialization ci = null;
    System.out.println("variable declared");
    Class<?> cl = ClassInitialization.class;
    System.out.println("java.lang.Class object obtained");
    System.out.println("y value from method is " + ClassInitialization.getYValue());
    System.out.println("main finished");
  }
}
