package liskov2;

import java.io.IOException;

public class Super {
  public Super() throws IOException {

  }
}

class Sub extends Super {
  public Sub() throws Exception { // cannot declare less / fewer exceptions than parent
//    try {
      super(); // NOT permitted to catch, because Parent aspect
      // has NOT been properly initialzied!!! Therefore, we cannot
      // consider this object properly constructed, no matter what!!!
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
  }
}

class TryIt {
  public static void main(String[] args) {
//    new Sub(); // what if the Super part throws IOException
  }
}