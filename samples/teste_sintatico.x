class Teste{

  int id;

  constructor(){
    ;
  }

  constructor(int i){
    id = i;
  }

  int getId(){
    return id;
  }

}

class Teste1 extends Teste{


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
    super(1);
  }

  int testaOperacoes(){
    //testa operadores booleanos
    boolean operadorBoolean;
    operadorBoolean = (1 == 2);
    operadorBoolean = (1 >= 2);
    operadorBoolean = (1 <= 2);
    operadorBoolean = (1 > 2);
    operadorBoolean = (1 < 2);
    operadorBoolean = (1 != 2);

    //testa operadores de adicao, substracao, multiplicacao, divisao, modulo...
    double operador;
    operador = 1+1;
    operador = 1-1;
    operador = 2/1;
    operador = 2*2;
    operador = 2%2;
  }


  int criacaoDeObjetos(){
    Teste testeCriacao;
    testeCriacao = new Teste();
    testeCriacao = new Teste(1);

    //TODO: nao esta funcionando, ajustar
    //testeCriacao.getId();

    return 0;
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

    if(1>2 && 2>2){
      return 0;
    } else{
      return 1;
    }

    if(1>2 || 2>2){
      return 0;
    } else{
      return 1;
    }

    if(1>2 || 2>2 && 1==2 || 2<10){
      return 0;
    } else{
      return 1;
    }

    int a;
    if(a>2){
      ;
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
    } (true || false && 1>2);

    return 0;
  }

  int metodoComWhileString(){
    do {
      print "Teste true\n";
    } (true || 1<2);
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
