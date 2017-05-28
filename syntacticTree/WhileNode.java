package syntacticTree;

import parser.*;

public class WhileNode extends StatementNode {

  public ExpreNode expression;
  public StatementNode s3 = null;
  public StatementNode statement = null;
  
  public WhileNode(Token t1, ExpreNode expression, StatementNode statement){
      super(t1);
      this.expression = expression;
      this.statement = statement;
  }

}
