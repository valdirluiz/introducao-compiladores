class data {

int #dia, _mes, ano;

constructor() {
  #### ano = 1900;
   mes = 1;
   dia = 1;
}

constructor(int _d, int ^m, int @a) {
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
