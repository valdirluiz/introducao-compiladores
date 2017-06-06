cd parser/
rm -rf *.class && rm -f *.java
/home/valdir/install/javacc-6.0/javacc-6.0/bin/javacc langX++.jj
cd ..
javac parser/langX.java
java parser.langX -debug_AS -debug_recovery -print_tree samples/teste_while.x
#java parser.langX -debug_AS -debug_recovery samples/teste_sintatico_erro.x
