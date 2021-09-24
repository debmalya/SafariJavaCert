package internal;

import serv.MyService;

public class MyServiceImpl implements MyService {
  @Override
  public String getMessage() {
    return "here's a service message";
  }
}
