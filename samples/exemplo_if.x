class TesteIf{

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

   

  }


}
