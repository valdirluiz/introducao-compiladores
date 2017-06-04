class TesteArvore{

  int a;
  string b;
  char c;
  double d;

  constructor(){
    super('a', "a", 1, 2>2, false, true, .2, null);
    a = 1;
    b = "stringValue";
    c = 'a';
    d = .2;
  }

  int metodoComRead(){
    int y;
    read y;
    return 0;
  }

  double metodoDouble(){
    ;
  }

  char metodoChar(){
    ;
  }

  string metodoString(){
    ;
  }

  boolean metodoBoolean(){
    ;
  }

  Pessoa metodoObjeto(){
    ;
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

  //metodo que retorna matriz
  int [] retornaVetor(int a) {
    int  a [];
    return a;
  }

  int metodoComFor(){
    //teste de for
    int i;
    for (i = 0; i < 10; i = i + 1){
      print "Teste\n";
      ;
    }
  }

  int testePrint(){
    print "a";
    print 'a';
    print 1;
    print true;
    print false;
    print .3;
    print a;
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

}
