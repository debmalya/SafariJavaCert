package nestedetc;

public class Ex1 {
  private int x;
  private String y;
  private Ex1() {}
  public static Ex1Builder builder() {
    return new Ex1Builder();
  }

  // static inner is called "nested" -- equivalent to a "top level" class
  // but has full access to private memebers of enclosing class.
  public static class Ex1Builder {
    private String alsoAccessible;
    Ex1 self = new Ex1();
    private Ex1Builder() {}
    public Ex1Builder x(int x) {
      self.x = x;
      return this;
    }
    public Ex1Builder y(String y) {
      self.y = y;
      return this;
    }
    public Ex1 build() {
      // VALIDATE
      Ex1 rv = self;
      self = null;
      return rv;
    }
  }
}


class UseEx1 {
  public static void main(String[] args) {
    Ex1 ex1 = Ex1.builder()
        .x(99)
        .y("Hello")
        .build();


  }
}