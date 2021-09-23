package liskov2;

public class Ex1 {
  public static void main(String[] args) /*throws Exception*/ {
    Base2 b2 = null;
    try {
      b2.doBaseStuff();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

class Base2 {
  void doBaseStuff() throws Exception {
    System.out.println("doBaseStuff");
  }
}

class Sub2 extends Base2 {
  void doBaseStuff() {
    System.out.println("doSubStuff");
  }
}
