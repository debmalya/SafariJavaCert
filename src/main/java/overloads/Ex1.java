package overloads;

public class Ex1 {
//  void doStuff(int x, int y) {}         // Method A
//  void doStuff(int x, long y) {}        // Method B
//  void doStuff(long x, int y) {}        // Method C
  void doStuff(int ... x) {}            // Method D
  void doStuff(Integer x, Integer y) {} // Method E

  void tryStuff() {
    doStuff(1, 2);
  }
}
