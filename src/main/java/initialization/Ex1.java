package initialization;

public class Ex1 {
  public static void main(String[] args) {
    Q25Sub.go();
  }
}

class Q25Base {
  int x = 99;
  {
    System.out.println("x is " + x);
  }
}

class Q25Sub extends Q25Base {
  Q25Sub(int x) {
    System.out.println("in constructor, x is " + x);
  }
  public static void go() {
    new Q25Sub(1);
  }
}