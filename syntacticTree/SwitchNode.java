package syntacticTree;

import parser.*;

public class SwitchNode  extends StatementNode{

  public ListNode l1;

  public SwitchNode(Token t1, ListNode l1){
    super(t1);
    this.l1  = l1;
  }

}
