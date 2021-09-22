package usingvar;

public class Ex1 {
  // var is NOT permitted for fields :)
//  var y = 100;

  // fails because no explicit initialization, and no
  // other context from which to determine type!
//  void doStuff(var x) { }


//  void doStuff() {
    // NOPE must initialize IN THE DECLARATION statement
//    var x;
//    x = 100;
//  }

  void doStuff() {
    // YES! immediately initiaized local variable :)
    var x = 100;
  }

//  public static void showAll(String [] sa) {
  public static void showAll(String ... sa) {
    for (String s : sa) {
      System.out.println("> " + s);
    }
  }

  public static void main(String[] args) {
    // IntelliJ control-Q for quick documentation tells the type :)
//    var x = 2_000_000_000;
//    x = "Hello";

    // type inferencing (i.e. the compiler decides type of array
    // suitable for the context...
//    String [] names = {"Fred", "Jim", "Sheila"};
    String [] names = new String[]{"Fred", "Jim", "Sheila"};
    showAll(names);
//    showAll({"Fred", "Jim", "Sheila"});
    showAll(new String[]{"Fred", "Jim", "Sheila"});
    showAll("Fred", "Jim", "Sheila");

//    var x = { 1, 2, 3 };
    var x = new int[]{ 1, 2, 3 };
  }
}
