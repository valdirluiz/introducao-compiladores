package syntacticTree;

import parser.*;


public class DoWhileNode  extends StatementNode{

    public StatementNode statement = null;
    public ExpreNode expression;

    public DoWhileNode(Token t1, StatementNode statement, ExpreNode expression){
      super(t1);
      this.statement = statement;
      this.expression = expression;
    }

}
