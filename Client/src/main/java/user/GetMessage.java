package user;

import java.util.ServiceLoader;

public class GetMessage {
  public static void main(String[] args) {
    System.out.println("message is " + prov.UseThis.message);

    ServiceLoader<serv.MyService> sl = ServiceLoader.load(serv.MyService.class);
    for (serv.MyService srv : sl) {
      System.out.println("Found a service: " + srv.getClass());
      System.out.println("message from service is " + srv.getMessage());
    }
  }
}
