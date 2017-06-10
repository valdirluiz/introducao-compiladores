package syntacticTree;

import parser.*;


public class PrintNode extends StatementNode {
    public ExpreNode expr;


    public PrintNode(Token t1, ExpreNode e) {
        super(t1);
        expr = e;     
    }
}
