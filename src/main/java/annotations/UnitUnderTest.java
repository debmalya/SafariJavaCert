package annotations;

//@RunMe
public class UnitUnderTest {
//  @RunMe
  String name;

  @RunMe
  public void runThis() {
    System.out.println("UUT.runThis");
  }

  @RunMe
  public void runThat() {
    System.out.println("UUT.runThat");
  }

  public void dontRunTheOther() {
    System.out.println("shouldn't run this one");
  }
}
