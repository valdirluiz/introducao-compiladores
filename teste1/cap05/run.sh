cd parser/
rm -rf *.class && rm -f *.java
/home/valdir/install/javacc-6.0/javacc-6.0/bin/javacc langX_sintatico_erro++.jj
cd ..
javac parser/langX.java
java parser.langX -debug_AS -debug_recovery teste_sintatico_sucesso.x
