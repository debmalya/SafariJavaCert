package initialization;

public class InstanceInitialization {
  {
//    System.out.println("in instance init, x = " + x);
    System.out.println("in instance init, x = " + this.x);
  }
  int x = 99;
  int y = getYValue(x);

  int getYValue(int x) {
    System.out.println("in getYValue()");
    return x * 2;
  }
  {
    System.out.println("instance init 2 x is " + x + " y is " + y);
  }

  // IF YOU HAVE ANY explicit constructor,
  // you LOSE the default one!
  public InstanceInitialization(int x) {
    // implicit super(); goes to object
    System.out.println("constructor(int) x is " + x);
  }
  public InstanceInitialization() {
    super(); // goes to object
//    this();
    System.out.println("zero arg constructor");
  }

  public static void main(String[] args) {
  }
}

class Sub extends InstanceInitialization {
  // IF ZERO constructors declared in code
  // compiler generates "default"
  // normal form of default is access same as class, zero arguments "does nothing"...
  // EXCEPT FOR initializing the PARENT
  Sub() {
    super(); // implicit in many cases
  }
}
