package lambdastuff;

import java.util.function.*;
import java.util.stream.Stream;

public class SimpleReduce {
  public static void main(String[] args) {
//    IntSupplier irand = () ->  (int)(Math.random() * 4) - 2;
//    Supplier<Integer> rand = () ->  (int)(Math.random() * 4) - 2;
    Supplier<Double> rand = () ->  Math.random() * 4 - 2;
//    Consumer<Double> cons = (d) -> System.out.println(d);
    Consumer<Double> cons = System.out::println;
    BinaryOperator<Double> adder = (a, b) -> a + b;
    var result = Stream.generate(rand)
        .limit(100_000)
        .reduce(0.0, adder);
//        .forEach(cons);
    System.out.println(result);
  }
}
