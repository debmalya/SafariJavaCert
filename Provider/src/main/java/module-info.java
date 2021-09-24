// module names tradionally should be lowercase, with dots, like packages
/*open */module Provider {
  exports prov to Client, NonExistent; // exports specifies a PACKAGE
  exports serv;
  opens prov to Client;
  provides serv.MyService with internal.MyServiceImpl;
}