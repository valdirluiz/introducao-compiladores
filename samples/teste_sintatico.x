class Teste {

  //declaração de variaveis
  int varInt;
  string varString;
  double varDouble;
  boolean varBoolean;
  char varChar;

  constructor(){
    ;
  }

  constructor(int teste){
    x = teste;
  }

  int metodoComIfElse(){

    if(true || false){
      print "Teste true ou false\n";
    }

    if(true && false){
      print "Teste true e false\n";
    }

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


  int metodoComWhile(){
    while (1>0){
      print "Teste true\n";
    }
  }


  int metodoComWhile(){
    do {
      print "Teste true\n";
    } (1>0);
    return 0;
  }

  int metodoComWhileBoolean(){
    do {
      print "Teste true\n";
    } (true);
    return 0;
  }

  int metodoComWhileString(){
    if("teste"){
      ;
    }
    do {
      print "Teste true\n";
    } ("Ok");
    return 0;
  }




  int metodoComSwitch(){
    int a;
    switch (a) {
      case 1 :
         return a + 1;
      case 2 :
        return  a + 2;
     default:
        return 0;
    }
  }

}
