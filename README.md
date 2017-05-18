# Compilador - Etapa de análise

Implementação do analisador léxico, sintático e semântico de um compilador para a linguagem X+++ utilizando a ferramenta [javacc](https://javacc.org).

## Analisador Léxico

Implementar, utilizando a ferramenta JavaCC, um analisador léxico capaz de reconhecer os tokens da linguagem X++, conforme a [especificação](docs/especificaocao.pdf).
Apresentar um relatório contendo:
1. A especificação léxica da linguagem utilizada como arquivo de entrada da ferramenta JavaCC,
2. O código fonte gerado em Java pela ferramenta javaCC
3. O arquivo .class gerado pelo compilador java a partir do código fonte gerado pelo JavaCC
4. Pelo menos dois arquivos com programas fonte escritos na linguagem X+++ contendo todos os recursos léxicos da linguagem (um exemplo sem erros léxicos e outro com alguns erros léxicos)
5. Os arquivos com os LOGs gerados pelo analisador léxico, referente aos programas de teste em X+++ com a listagem dos tokens reconhecidos pelo programa

Postar todos os arquivos no moodle em um arquivo compactado (.ZIP).

A execução do trabalho será feito em grupos e acompanhada nas aulas no laboratório, considerando a participação de todos os alunos do grupo.

**Data da entrega**: 10/05 até 23:55

## Geração do código

Como gerar os arquivos java:

```bash
cd introducao-compiladores/parser
javacc langX+++.jj
```

Como compilar os arquivos:

```bash
cd introducao-compiladores
javac parser/langX.java
```

Como compilar o codigo usando o compilador gerado:

```bash
cd  introducao-compiladores
java parser.langX [-short] [-debug_AS] samples/teste_sintatico_erro.x
java parser.langX [-short] [-debug_AS] samples/teste_sintatico.x
javac -Xlint:unchecked parser/langX.java 
```

Isso ai :+1:.
