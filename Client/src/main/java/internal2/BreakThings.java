package internal2;

import java.lang.reflect.Field;

public class BreakThings {
  public static void main(String[] args) throws Throwable {
//    System.out.println(DontUseThis.secret);

    Class<?> cl = prov.UseThis.class;
    Field f = cl.getDeclaredField("privateMessage");
    f.setAccessible(true);
    String msg = (String)f.get(null);
    System.out.println("private message is " + msg);
  }
}
