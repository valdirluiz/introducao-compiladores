package syntacticTree;

import parser.*;


public class ReturnNode extends StatementNode {
    public ExpreNode expr;


    public ReturnNode(Token t1, ExpreNode e) {
        super(t1);
        expr = e;
    }
}
