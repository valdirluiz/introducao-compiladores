package syntacticTree;

import parser.*;


public class DoWhileNode  extends StatementNode{

    public StatementNode statement = null;
    public ListNode expressions;

    public DoWhileNode(Token t1, StatementNode statement, ListNode expressions){
      super(t1);
      this.statement = statement;
      this.expressions = expressions;
    }

}
