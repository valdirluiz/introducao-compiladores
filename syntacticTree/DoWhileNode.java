package syntacticTree;

import parser.*;


public class DoWhileNode  extends StatementNode{

    public StatementNode statement = null;
    public ListNode expre;

    public DoWhileNode(Token t1, StatementNode statement, ListNode expre){
      super(t1);
      this.statement = statement;
      this.expre = expre;
    }

}
