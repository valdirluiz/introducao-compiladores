package syntacticTree;

import parser.*;

public class WhileNode extends StatementNode {

  public ListNode expressions;
  public StatementNode s3 = null;
  public StatementNode statement = null;

  public WhileNode(Token t1, ListNode expressions, StatementNode statement){
      super(t1);
      this.expressions = expressions;
      this.statement = statement;
  }

}
