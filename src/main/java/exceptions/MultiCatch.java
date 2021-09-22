package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiCatch {
  public static void doStuff() throws SQLException, /*IOException,*/ FileNotFoundException {
//    throw new FileNotFoundException();
//    throw new IOException();
  }

  public static void useStuff() throws SQLException, IOException {
    try {
      doStuff();
    } catch (IOException |/* FileNotFoundException |*/ SQLException ex) {
      ex.printStackTrace();
      throw ex;
    }
//    } catch (Exception e) {
//      e.printStackTrace();
//      throw e; // "Smart" throws clause if you throw the original exception you caught
//      // and that variable is final or effectively final.
////      Exception ex = e;
////      throw ex;
//    }

//    } catch (SQLException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
  }
}
