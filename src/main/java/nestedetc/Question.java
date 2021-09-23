package nestedetc;

class O {
  int x;

  O(int x) {
    this.x = x;
  }

  public /*static*/ void makeOne() {
    new I(20); // becomes
    this.new I(20);
    new O(10).new I(20);
  }

  class I {
    int x;
    int y;

    I(int y) {
      this.y = y;
    }

    void show() {
      System.out.println("y is " + y + " x is " + x
      + " outer x is " + O.this.x); // "qualified this"
    }
  }
}

public class Question {
  public static void main(String[] args) {
    O.I i = new O(50).new I(100);
    i.show();
  }
}

