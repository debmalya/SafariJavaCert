package lambdastuff;

interface MyParentInter {
  void doOtherStuff();
}

@FunctionalInterface
interface MyInter /*extends MyParentInter*/ {
  void doStuff();
//  void doOtherStuff();
  default void irrelevant() {}
  static void moreRubbish() {}
  private void really() {}
}

public class FunctInter {
  public static void main(String[] args) {
    MyInter mi = () -> System.out.println("Hello");

    mi.doStuff();
  }
}
