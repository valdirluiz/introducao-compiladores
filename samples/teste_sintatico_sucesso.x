class Teste{

  int testInt;
  string testString;
  char testChar;
  double testDouble;
  boolean testBoolean;


  constructor(){
    ;
  }

  constructor(int a){
    testInt = a;
  }

  constructor(int a, string b, char c, double d, boolean e){
     testInt = a;
     testString = b;
     testChar = c;
     testDouble = d;
     testBoolean = e;
  }

  int getId(){
    return id;
  }

}

class Teste1 extends Teste{

  /*
  * Teste comentario multilinhas
  */


  //declaração de variaveis
  int varInt;
  string varString, varString2;
  boolean varBoolean;
  double testeFloat;
  char testeChar;


  constructor(){
    varInt = 1;

    varString = "Teste";

    varBoolean=true;
    varBoolean=false;

    testeFloat = 1.1;
    testeFloat = .1;
    testeFloat = 1.2E-4;
    testeFloat = 1.2e-4;
    testeFloat = .2e-4;
    testeFloat = .2E-4;

    testeChar = 'a';
    testeChar = 'A';
    testeChar = '1';
  }

  constructor(int teste){
    x = teste;
    super(1, "teste", 'a', .2e-4, true);
  }

  int metodoComRead(){
    int y;
    read y;
  }

  //metodo que retorna matriz
  int [] retornaVetor(int a) {
    int  a [];
    return a;
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

  int metodoComFor(){
    //teste de for
    int i;
    for (i = 0; i < 10; i = i + 1){
      print "Teste\n";
      if(i==10){
        //exemplo de break
        break;
      }
    }
  }

  int criacaoMatriz(){
    int m[][];
    m = new int[1][2];

    string m_2;
    m_2 = new string[1];

    double m_3;
    m_3 = new string[1];
  }

  string criacaoDeObjetos(){
    Teste testeCriacao;
    testeCriacao = new Teste();
    testeCriacao = new Teste(1);

 

    //testa retornos
    return a;
    return false;
    return true;
    return 'a';
    return "";
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



  int metodoComWhile(){
    while (1>0){
      print "Teste true\n";
    }

    while (true){
      break;
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
