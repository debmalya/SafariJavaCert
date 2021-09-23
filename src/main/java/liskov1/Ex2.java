package liskov1;

public class Ex2 {
}

class Q23Base {
  public long get() { // requires an 8 byte return value
    return 0L;
  }
}

class Q23Sub extends Q23Base {
//  public int get() { // requiers a 4 byte return value
  public long get() { // no covariant returns with primitive types!!!
    return 0;
  }
}
//class Q23Base {
//  public Q23Base get() { // requires one reference
//    return null;
//  }
//}
//
//class Q23Sub extends Q23Base {
//  public Runnable get() { // requires one reference
//    return null;
//  }
//}