package nestedetc;

import java.lang.reflect.Constructor;
import java.util.Iterator;

public class MyList<E> implements Iterable<E> {
  private E[] data = (E[])new Object[10];
  private int count = 0;

  public void add(E e) {
    data[count++] = e; // OVERFLOW
  }

  @Override
  public Iterator<E> iterator() {
    return new MyIterator();
  }

  // non-static!!!!
  private class MyIterator implements Iterator<E> {
    // implicit reference to a particular MyList...

    private MyIterator(){}
    private int progress = 0;
    @Override
    public boolean hasNext() {
      return progress < count;
    }

    @Override
    public E next() {
      return data[progress++];
    }
  }

  public static void main(String[] args) {
    MyList<String> mls = new MyList<>();
    mls.add("Fred");
    mls.add("Jim");
    mls.add("Sheila");
    for (String s : mls) { // implicit call to mls.iterator(), and hasNext()/next() repeatedly
      System.out.println("> " + s);
    }
    Class<?> mlc = MyList.MyIterator.class;
    Constructor<?>[] cons = mlc.getDeclaredConstructors();
    for (Constructor c : cons) {
      System.out.println(c);
    }
  }
}
