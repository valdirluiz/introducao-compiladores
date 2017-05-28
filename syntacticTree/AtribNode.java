package syntacticTree;

import parser.*;


public class AtribNode extends StatementNode {
    public ExpreNode expr1;
    public ExpreNode expr2;
    public Token t2;

    public AtribNode(Token t1, ExpreNode e1, ExpreNode e2, Token t2) {
        super(t1);
        expr1 = e1;
        expr2 = e2;
        this.t2 = t2;
    }
}
