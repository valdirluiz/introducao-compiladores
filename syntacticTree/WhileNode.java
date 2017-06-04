package syntacticTree;

import parser.*;

public class WhileNode extends StatementNode {

  public ListNode expressions;
  public StatementNode statement = null;
  public ListNode connectors;

  public WhileNode(Token t1, ListNode expressions, StatementNode statement, ListNode connectors){
      super(t1);
      this.expressions = expressions;
      this.statement = statement;
      this.connectors = connectors;
  }

}
