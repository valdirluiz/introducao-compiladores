package syntacticTree;

import parser.*;

public class SwitchNode  extends StatementNode{

  public ListNode l1;
  public Token t2;

  public SwitchNode(Token t1, ListNode l1, Token t2){
    super(t1);
    this.l1  = l1;
    this.t2 = t2;
  }

}
