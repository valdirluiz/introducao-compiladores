class TesteWhile{
  int metodoComWhile(){
    while (1>0){
      print "Teste true\n";
    }

    while (true){
      break;
    }
  }


  int metodoComDoWhile(){
    do {
      print "Teste true\n";
    } (1>0);
    return 0;
  }
}
