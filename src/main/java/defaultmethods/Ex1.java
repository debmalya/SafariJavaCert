package defaultmethods;

interface IntA {
  default void doStuff() { System.out.println("IntA.doStuff()"); }
}

interface IntB {
  default void doStuff() { System.out.println("IntB.doStuff()"); }
}

class ClA implements IntA, IntB {
//  public void doStuff() { System.out.println("ClA.doStuff"); }
  public void doStuff() {
    IntB.super.doStuff();
    IntA.super.doStuff();
  }
}

public class Ex1 {
  public static void main(String[] args) { new ClA().doStuff(); }
}