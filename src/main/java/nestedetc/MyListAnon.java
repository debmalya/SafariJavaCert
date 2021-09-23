package nestedetc;

import java.lang.reflect.Constructor;
import java.util.Iterator;

public class MyListAnon<E> implements Iterable<E> {
  private E[] data = (E[])new Object[10];
  private int count = 0;

  public void add(E e) {
    data[count++] = e; // OVERFLOW
  }

  @Override
  public Iterator<E> iterator() {                     // can pass constuctor args to parent class
    return new /*private class MyIterator implements */ Iterator<E>() {
      // anonymous will be instance or static based on context.
      private int progress = 0;

      // no explicit constructors! (What would their name be)
      @Override
      public boolean hasNext() {
        return progress < count;
      }

      @Override
      public E next() {
        return data[progress++];
      }
    };
  }


  public static void main(String[] args) {
    MyListAnon<String> mls = new MyListAnon<>();
    mls.add("Fred");
    mls.add("Jim");
    mls.add("Sheila");
    for (String s : mls) { // implicit call to mls.iterator(), and hasNext()/next() repeatedly
      System.out.println("> " + s);
    }
  }
}
