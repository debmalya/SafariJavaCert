package lambdastuff;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

class Average {
  private double sum = 0;
  private long count = 0;

  public Average() {}

  public void include(double d) {
    this.sum += d;
    this.count++;
  }

  public void merge(Average other) {
    this.sum += other.sum;
    this.count += other.count;
  }

  public Optional<Double> get() {
    if (count > 0) {
      return Optional.of(sum / count);
    } else {
      return Optional.empty();
    }
  }
}
public class Averager {
  public static void main(String[] args) {
    ThreadLocalRandom.current().doubles(10_000, -2, +2)
//        .collect(() -> new Average(), (a, d) -> a.include(d), (a1, a2) -> a1.merge(a2))
        .collect(Average::new, Average::include, Average::merge)
        .get()
        .map(x -> "Average is " + x)
//        .ifPresentOrElse(x -> System.out.println(x),
        .ifPresentOrElse(System.out::println,
            () -> System.out.println("no numbers found"));
  }
}
