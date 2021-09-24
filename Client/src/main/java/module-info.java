module Client {
  // requires specifies a MODULE
  // requires says A) I want to READ this
  // and B) the module should be available for loading
  requires Provider;
  uses serv.MyService;
}