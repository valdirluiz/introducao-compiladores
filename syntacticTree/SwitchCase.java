package syntacticTree;

import parser.*;

public class SwitchCase extends GeneralNode   {

  public StatementNode statement;
  public ExpreNode expreNode;

  public SwitchCase(Token t, StatementNode statement, ExpreNode expreNode) {
      super(t);
      this.statement = statement;
      this.expreNode = expreNode;
  }

}
