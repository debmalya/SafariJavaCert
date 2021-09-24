package lambdastuff;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class Closure {
//  public static IntBinaryOperator getAdder() {
//    return (a, b) -> a + b;
//  }

  public int x = 99;
  public IntUnaryOperator getAdder(/*final*/ int offset) {
//    offset++;

    // "grabbing a value from a short-lived context", and
    // promoting its lifetime to a long-lived context
    // is called a "closure"
    // IMPORTANT, a closure-captured value must not change
    // "final, or effectively final"
//    return (a) -> a + /*++*/offset;
    return (a) -> a + this.x;
  }

  public static void main(String[] args) {
//    IntBinaryOperator adder = getAdder();
//    int sum = adder.applyAsInt(1, 2);

    IntUnaryOperator adder = new Closure().getAdder(99);
    int sum = adder.applyAsInt(4);
    System.out.println(sum);
  }
}
