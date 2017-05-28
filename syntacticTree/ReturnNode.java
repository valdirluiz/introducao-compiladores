package syntacticTree;

import parser.*;


public class ReturnNode extends StatementNode {
    public ExpreNode expr;
    public Token t2;

    public ReturnNode(Token t1, ExpreNode e, Token t2) {
        super(t1);
        expr = e;
        this.t2 = t2;
    }
}
