package liskov1;

public class Ex1 {
}
class Base2 {
  void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
}

class Sub2 extends Base2 {
//  @Override
  void doBaseStuff() {
    System.out.println("doSubStuff");
//    return 99;
  }
}