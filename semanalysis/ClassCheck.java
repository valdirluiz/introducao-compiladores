package semanalysis;

import symtable.*;

import syntacticTree.*;


public class ClassCheck {
    Symtable Maintable; // tabela de mais alto nivel
    protected Symtable Curtable; // apontador para a tabela corrente
    int foundSemanticError; // contador de erros encontrados

    public ClassCheck() {
        EntrySimple k;

        foundSemanticError = 0;
        Maintable = new Symtable(); // cria tabela principal
        k = new EntrySimple("int");
        Maintable.add(k);
        k = new EntrySimple("string");
        Maintable.add(k);
        k = new EntrySimple("char");
        Maintable.add(k);
        k = new EntrySimple("boolean");
        Maintable.add(k);
        k = new EntrySimple("double");
        Maintable.add(k);
    }

    public void ClassCheckRoot(ListNode x) throws SemanticException {
        Curtable = Maintable; // tabela corrente = principal
        ClassCheckClassDeclListNode(x); // chama an�lise para raiz da �rvore

        if (foundSemanticError != 0) { // se houve erro, lan�a exce��o
            throw new SemanticException(foundSemanticError +
                " Semantic Errors found (phase 1)");
        }
    }

    public void ClassCheckClassDeclListNode(ListNode x) {
        if (x == null) {
            return;
        }

        try {
            ClassCheckClassDeclNode((ClassDeclNode) x.node);
        } catch (SemanticException e) { // se um erro ocorreu na classe, da a msg mas faz a an�lise p/ pr�xima
            System.out.println(e.getMessage());
            foundSemanticError++;
        }

        ClassCheckClassDeclListNode(x.next);
    }

    public void ClassCheckClassDeclNode(ClassDeclNode x)
        throws SemanticException {
        Symtable temphold = Curtable; //  salva apontador p/ tabela corrente
        EntryClass nc;

        if (x == null) {
            return;
        }

        // procura classe na tabela
        nc = (EntryClass) Curtable.classFindUp(x.name.image);

        if (nc != null) // j� declarada, ERRO
         {
            throw new SemanticException(x.name,
                "Class " + x.name.image + " already declared");
        }

        // inclui classe na tabela corrente
        Curtable.add(nc = new EntryClass(x.name.image, Curtable));
        Curtable = nc.nested; // tabela corrente = tabela da classe
        ClassCheckClassBodyNode(x.body);
        Curtable = temphold; // recupera apontador p/ tabela corrente
    }

    public void ClassCheckClassBodyNode(ClassBodyNode x) {
        if (x == null) {
            return;
        }

        ClassCheckClassDeclListNode(x.clist);
    }
}
