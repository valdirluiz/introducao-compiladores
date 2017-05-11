

class Pessoa{

  class Data {
    int dia, mes, ano;
  }

  constructor(){
    //construtor vazio
  }

  construtor(string n){
    nome = n;
  }

  //tipos primitivos
  int qt_Dependentes;
  string nome;
  Data dtNascimento;
  char genero;
  double peso;
  boolean ativo_1;
  int fotos [];

}

class PessoaFisica extends Pessoa {

  //constantes flat
  double testeFloat1 = 1.1;
  double testeFloat2 = .1;
  double testeFloat3 = 1.2E-4;
  double testeFloat4 = 1.2e-4;
  double testeFloat5 = .2E-4;
  double testeFloat6 = .2e-4;

  //constante inteira
  int testeInt = 1;

  //constante boolean
  boolean testeBoolean1 = true;
  boolean testeBoolean2 = false;

  //atribuicao booleana
  boolean testeBoolean3 = 1 < 2 ;

  //constante char
  char charTeste = 'a';
  char charTeste2 = 'A';

  //constante String
  string constanteString = "teste constante String";

  //constante null
  Pessoa nullTeste = null;

  /*
  * Teste comentario
  */

  //testa operadores booleanos
  boolean operador_igual = (1 == 2);
  boolean operador_maior_igual = (1 >= 2);
  boolean operador_menor_igual = (1 <= 2);
  boolean operador_maior = (1 > 2);
  boolean operador_menor = (1 < 2);
  boolean operador_diferente = (1 != 2);

  //testa operadores de adicao, substracao, multiplicacao, divisao, modulo...

  int operadorAdicao = 1+1;
  int operadorSubstracao = 1-1;
  double operadorDivisao = 2/1;
  int operadorMultiplicacao = 2*2;
  double operadorModulo = 2%2;


  //classe alinhada
  class Endereco{
    string rua;
    int numero;

    constructor(){
      //chamada de constructor da classe pai
      super("nome");
    }

    construtor(string r){
      rua = r;
    }

    construtor(string r, int n){
      rua = r;
      numero = n;
    }

  }

  // Variavel criada com identificador
  Endereco endereco;

  int metodo_1(){

    int y;
    read y;

    //teste de if e else
    if(1>2){
      print "Teste 1 \n";
    } else{
      print "Teste 2 \n";
    }

    //if com and
    if(true && true){
      print "Teste 1 \n";
    }

    //if com or
    if(true || false){
      print "Teste 1 \n";
    }

     

    //teste de for
    for (i = 0; i < 10; i = i + 1){
      print "Teste\n";
      if(i==10){
        //exemplo de break
        break;
      }
    }

    //teste do while
    do {
      print "Teste true\n";
    } while(1>0);

    //teste  while
    while (1>0) {
      print "Teste true\n";
    }

    //criando objetos
    endereco = new Endereco();
    endereco = new Endereco("Rua 1");
    endereco = new Endereco("Rua 1", 87);

    //matrizes
    int m[][] = new int[1][2];
    string m_2 = new string[1];
    double m_3 = new string[1];

    return 0;
  }


   //metodo com ex de switch
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


   //metodo que retorna matriz
   int [] retornaVetor(int a) {
     return new int[1];
   }
}
