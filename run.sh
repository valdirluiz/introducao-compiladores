cd parser/
rm -rf *.class && rm -f *.java
/home/100000000491035/javacc-6.0/javacc-6.0/bin/javacc langX++.jj
cd ..
javac parser/langX.java
cd samples
rm -rf *.log
cd ..
java parser.langX -debug_AS -debug_recovery -print_tree samples/exemplo_if.x > samples/exemplo_if.log
java parser.langX -debug_AS -debug_recovery -print_tree samples/exemplo_switch.x > samples/exemplo_switch.log
java parser.langX -debug_AS -debug_recovery -print_tree samples/teste_arvore.x > samples/teste_arvore.log
java parser.langX -debug_AS -debug_recovery -print_tree samples/teste_sintatico_erro.x > samples/teste_sintatico_erro.log
java parser.langX -debug_AS -debug_recovery -print_tree samples/teste_sintatico_sucesso.x > samples/teste_sintatico_sucesso.log
java parser.langX -debug_AS -debug_recovery -print_tree samples/teste_while.x > samples/teste_while.log
 
