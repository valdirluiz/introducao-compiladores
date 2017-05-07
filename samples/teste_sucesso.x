

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

  int qt_Dependentes;
  string nome;
  Data dtNascimento;
  char genero;
  double peso;
  boolean ativo_1;
  int fotos [];

}

class PessoaFisica extends Pessoa {

  class Endereco{
    string rua;
    int numero;

    constructor(){
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

    //teste de for
    for (i = 0; i < 10; i = i + 1){
      print "Teste\n";
      if(i==10){
        break;
      }
    }

    //teste de while
    while (1>0) {
      print "Teste true\n";
    }

    //teste do while
    do {
      print "Teste true\n";
    } while(1>0);

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

   int metodoComAtribuicoesDeTodosOsTipos(){
     //TODO: add tipo char
     int a = 1;
     double b = 1.1;
     endereco = new Endereco();
     endereco = new Endereco("Rua 1");
     endereco = new Endereco("Rua 1", 87);

     string rua = "teste";
     int numero = 2;
     endereco = new Endereco(rua, 2);

     int m[][] = new int[1][2];
     string m_2 = new string[1];
     double m_3 = new string[1];

     boolean b1 = 1 < 2 ;

   }

   int [] retornaVetor(int a) {
     return new int[1];
   }
}
