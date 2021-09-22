package control;

public class IfElse {
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
