cd parser/
rm -rf *.class && rm -f *.java
javacc langX++.jj
cd ..
javac parser/langX.java
java parser.langX -debug_AS -debug_recovery samples/teste_sintatico_sucesso.x
#java parser.langX -debug_AS -debug_recovery samples/teste_sintatico_erro.x
