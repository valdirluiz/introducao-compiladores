class Teste{

    //testa classe alinhada
    class data{
      //classe alinhada da classe alinhada e extends
      class TesteClass extends data{

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

    //testa retorno de string
    string met2(){
      return "teste";
    }

    //teste retorno de objeto
    data met3(){
      data d1;
      d1 = new data();
      return d1;
    }

    //testa retorno char
    char met4(){
      return 'a';
    }

    //testa retorno boolean constant
    boolean met5(){
      return true;
    }

    boolean met6(){
      boolean teste;
      teste = false;
      return teste;
    }

    //testa retorno double
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

   //testes com if
   int met14(){
     if(1>2){
       return 1;
     } else{
       return 0;
     }
   }

   //testa operacao com matriz
   int met15(){
     int m[][];
     m = new int[1][2];
     if(m[1][1] > 2){
       return 0;
     }
     return 1;
   }
   
   //testa if
   int met16(){
    boolean a;
    boolean c;
    a = true;

     if(a && c){
       return 1;
     } else{
       return 0;
     }
   }

   //teste while
  int met17(){
    boolean a;
    while (a){
        print "Teste true\n";
    }

    while (true){
      break;
    }
  }

  //testa do while
  int met18(){
    boolean a;
    do {
      print "Teste true\n";
    } (a);
    return 0;
  }

  //teste switch 
  int met19(){
      int a_1;
      switch (a_1) {
        case 1 :
           return 1;
        case 2 :
          break;
       default:
          break;
      }
  }

  //teste for
  int met20(){
    int i;
    for (i = 0; i < 10; i = i + 1){
        print "Teste\n";
        if(i==10){
          break;
        }
    }
  }

}
