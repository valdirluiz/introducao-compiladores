

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
  Endereco endereco_2;
  Endereco endereco_3;


   int metodo(){
     return 0;
   }

   int metodoComPrint(){
     print "Teste\n";
     return 0;
   }

   int metodoComRead(){
     int a, b;
     read a; read b;
   }

   int metodoComIf(){

     if(1>2){
       return 0;
     } else{
       return 0;
     }

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
     endereco_2 = new Endereco("Rua 1");
     endereco_3 = new Endereco("Rua 1", 87);

     string rua = "teste";
     int numero = 2;
     endereco_3 = new Endereco(rua, 2);

     int m[][] = new int[1][2];
     string m_2 = new string[1];
     double m_3 = new string[1];

     boolean b1 = 1 < 2 ;

   }

   int [] retornaVetor(int a) {
     return new int[1];
   }
}
