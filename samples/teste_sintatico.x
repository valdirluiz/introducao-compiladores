class Teste {


  int varInt;
  string varString;
  double varDouble;
  char varChar;
  boolean varBoolean;

  constructor(){
    ;
  }

  constructor(int teste){
    x = teste;
  }

  int metodoComIfElse(){

    if(true){
      print "Teste true\n";
    } else{
        print "Teste false\n";
    }

    if(false){
      print "Teste true\n";
    } else{
        print "Teste false\n";
    }

    if(1>2){
      return 0;
    } else{
      return 1;
    }
  }

  int metodoComFor(){
    int i;
    for (i = 0; i < 10; i = i + 1){
      print "Teste\n";
      if(i==10){
        break;
      }
    }
    return 0;
  }

  //TODO: ajustar esta com erro
  /*int metodoComWhile(){
    while (1>0) {
      print "Teste true\n";
    }
  }*/

  //TODO: ajustar esta com erro
  /*int metodoComWhile(){
    do {
      print "Teste true\n";
    } while(1>0);
    return 0;
  }*/



//TODO: ajustar esta com erro
/*  int metodoComSwitch(){
    int a;
    switch (a) {
      case 1 :
         return a + 1;
     case 2 :
        return  a + 2;
     default:
        return 0;
    }
  }*/

}
