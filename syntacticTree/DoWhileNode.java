package syntacticTree;

import parser.*;


public class DoWhileNode  extends StatementNode{

    public StatementNode statement = null;
    public ListNode expressions;
    public ListNode connectors;

    public DoWhileNode(Token t1, StatementNode statement, ListNode expressions, ListNode connectors){
      super(t1);
      this.statement = statement;
      this.expressions = expressions;
      this.connectors = connectors;
    }

}
