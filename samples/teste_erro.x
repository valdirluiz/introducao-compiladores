class data {

int #dia, mes, ano;

char charTeste1 = '%';
char charTeste2 = '*';
char charTeste3 = '$';

constructor() {
  #### ano = 1900;
   mes = 1;
   dia = 1;
}

constructor(int d, int ^m, int @a) {
   dia = d;
   mes = m;
   ano = a;
}

int @compara(data x) {
   if ( ano < x.ano) return -1;
   if ( ano > x.ano) return 1;
   if ( mes < x.mes) return -1;
   if ( mes > x.mes) return 1;
   if ( dia < x.dia) return -1;
   if ( dia > x.dia) return 1;
   return 0;
}


}
