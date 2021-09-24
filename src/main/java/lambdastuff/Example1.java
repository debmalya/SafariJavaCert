package lambdastuff;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

class LengthComparator implements Comparator<String> {
  @Override
  public int compare(String o1, String o2) {
    return Integer.compare(o1.length(), o2.length());
  }
}

public class Example1 {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(List.of("Fred", "Alice", "Jim", "Sheila", "Bert", "Joan"));
    System.out.println(names);
//    names.sort(new LengthComparator());
    // compiler knows the ONLY valid argument type is Comparator<String>
    // knows that Comparator is an interface
    // also, there is only one abstract method in that interface
    // we must ONLY be interested in providing an implementation of THAT ONE abstract method
    names.sort(
// lambda expression is an expression OF OBJECT TYPE
        (String o1, String o2) -> {
          return Integer.compare(o1.length(), o2.length());
        }

    );
    System.out.println(names);
//    Comparator<String> obj = (String o1, String o2) -> {
//      return Integer.compare(o1.length(), o2.length());
//    };
//    Comparator<String> obj = (String o1, String o2) -> Integer.compare(o1.length(), o2.length()) ;
//    Comparator<String> obj = (o1, o2) -> Integer.compare(o1.length(), o2.length()) ;
//    Comparator<String> obj = (@Deprecated var o1, String o2) -> Integer.compare(o1.length(), o2.length()) ;
    Comparator<String> obj = (@Deprecated var o1, var o2) -> Integer.compare(o1.length(), o2.length()) ;

    System.out.println("Type of obj is " + obj.getClass());
//    int res = obj("x", "y"); // NO NO NO it's an object, not a function
    int res = obj.compare("x", "y");

    Predicate<String> ps = s -> s.length() > 3;
  }
}
