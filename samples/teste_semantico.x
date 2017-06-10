class Teste{

  //testa classe alinhada
  class data{
    //classe alinhada da classe alinhada
    class TesteClass{

    }
    int dia;
    int mes;
    int ano;
    string toString;
    double hora;
    char formato;
    TesteClass teste;

    //testa constructor
    constructor(int a, int b, int c, string d, double e, char f, TesteClass g){
      dia = a;
      mes = b;
      ano = c;
      toString = d;
      hora = e;
      formato = f;
      teste = g;
    }

  }

  //testa atributos
  char a;
  boolean b;
  double c;
  string d;
  int e;
  data f;

  //testa metodos e tipos de retornos
  int met1(){
    return 1;
  }
  string met2(){
    return "teste";
  }

  data met3(){
    data d1;
    d1 = new data();
    return d1;
  }

  char met4(){
    return 'a';
  }

  boolean met5(){
    return true;
  }

  boolean met6(){
    boolean teste;
    teste = false;
    return teste;
  }

  double met7(){
    return .3;
  }

  double met8(){
    return 1.1;
  }

  double met9(){
      return 1.2E-4;
  }

  double met10(){
      return .2e-4;
  }

  //testa atribuicao float
  double met11(){
    double testeFloat;
    testeFloat = .1;
    testeFloat = 1.2e-4;
    testeFloat = .2e-4;
    testeFloat = .2E-4;
    return testeFloat;
 }

 //testa atribuicao boolean
 boolean met12(){
   boolean varBoolean;
   varBoolean=true;
   varBoolean=false;
   return varBoolean;
 }

 //testa atribuicao char
 char met13(){
   char testeChar;
   testeChar = 'a';
   testeChar = 'A';
   testeChar = '1';
   return testeChar;
 }


}
