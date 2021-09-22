package usingvar;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class Ex3 {
  public static void main(String[] args) {

//         for (var x = 0; x < 3; x++)
//      System.out.println(x);
//  }
//  B)
//    try (var in = new FileReader("");
//         var out = new FileWriter("")) {
//    }
//  }
//  C)
  var var = "var";

//    int var = 99;

//    int goto = 99;

    int x = 99;
    Object s = "Hello";
    var res = (Math.random() > 0.5) ? x : s;
    System.out.println("instanceof Serializble? " + (res instanceof Serializable));
    System.out.println("instanceof Comparable? " + (res instanceof Comparable));
    //    res.compareTo(...)
  }
}

// var is NOT a keyword, it's a "pseudo-type"
//class var {}
