package control;

enum Suit {
  HEARTS, DIAMONDS("I'm mr sparkly"), SPADES, CLUBS;
  private String myName;
  private Suit() {
    myName = "unspecified";
  }
  // default for enum constructors is private (also the ONLY permitted access)
  Suit(String s) {
    myName = s;
  }
  @Override
  public String toString() {
    return "I'm a suit called " + this.name().toLowerCase();
  }
}

public class UseSwitch {
  public static void main(String[] args) {
    // switch in Java 11 works on:
    // int (will promote smaller numerics), String, enum
    Suit s = Suit.HEARTS;
    switch (s) {
//      case Suit.HEARTS:
      case HEARTS:
        System.out.println("It's " + s.toString());
        break; // NECESSARY TO avoid fall through
      case DIAMONDS:
        System.out.println("I'm diamonds, I think...");
        return; // return also prevents fall-through (because it leaves!)
      case CLUBS:
        System.out.println("it's clubs");
    }
    System.out.println("finished switch");
    String str = null;
    switch (str) {
      case "Hello":
        System.out.println("Hello to you too");
    }
  }
}
