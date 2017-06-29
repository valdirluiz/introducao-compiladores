class teste{

int met1(){
  break;
}

//sem retorno
int met2(){
;
}

//retorno de tipo diferente
int met3(){
  return "";
}

//nao declarado
int met4(){
  teste = "teste";
  return 1;
}

//escopo
int met5(){
  int i;
  for (i = 0;i <= intvar7;i = i + 1) {
    int b;
  }
  return  b;
}

//tipo diferente
int met6(){
    char a_1;
    switch (a_1) {
      case 1 :
         return 1;
      case 2 :
        break;
     default:
        break;
    }
    return 1;
}


}
