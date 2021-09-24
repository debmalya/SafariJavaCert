package annotations;

//@RunMe
public class UnitUnderTest {
//  @RunMe
  String name;

  @RunMe(99) // equivalent to value=99
  public void runThis() {
    System.out.println("UUT.runThis");
  }

  @RunMe(name="Sheila", value=100)
  public void runThat() {
    System.out.println("UUT.runThat");
  }

  public void dontRunTheOther() {
    System.out.println("shouldn't run this one");
  }
}
