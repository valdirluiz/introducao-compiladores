package syntacticTree;

import parser.*;


public class PrintNode extends StatementNode {
    public ExpreNode expr;
    public Token string_constant;

    public PrintNode(Token t1, ExpreNode e, Token t2) {
        super(t1);
        expr = e;
        string_constant = t2;
    }
}
