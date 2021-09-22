package control;

public class IfElse {
  private static final boolean DEBUG = true;
  public static void doStuff() {
    if (DEBUG) {
      return;
    } else {
      System.out.println("also 'unreachable'");
    }
    System.out.println("Really!");
    while (DEBUG) {
      System.out.println("always");
    }
//    System.out.println("never");
  }

  public static void main(String[] args) {
    int x = 0;
    // Java does NOT HAVE "truthy" and "falsy"
    // boolean must be boolean or Boolean
//    if (x) {}

    // curlies optional but ONLY for a single subordinate statement
    if (Math.random() > 0.5)
      System.out.println("big");
      System.out.println("also big"); // NOT Subordinate!!!


  }
}
