/* langXTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. langXTokenManager.java */
package parser;
import java.io.*;

/** Token Manager. */
@SuppressWarnings("unused")public class langXTokenManager implements langXConstants {
int countLexError = 0;

public int foundLexError()
{
   return countLexError;
}

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x23fffff000L) != 0L)
         {
            jjmatchedKind = 38;
            return 1;
         }
         if ((active0 & 0x2000000000000L) != 0L)
            return 25;
         return -1;
      case 1:
         if ((active0 & 0x23bf7bf000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 38;
               jjmatchedPos = 1;
            }
            return 1;
         }
         if ((active0 & 0x40840000L) != 0L)
            return 1;
         return -1;
      case 2:
         if ((active0 & 0x23bef1f000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 2;
            return 1;
         }
         if ((active0 & 0x10a0000L) != 0L)
            return 1;
         return -1;
      case 3:
         if ((active0 & 0x2bad17000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 3;
            return 1;
         }
         if ((active0 & 0x2104208000L) != 0L)
            return 1;
         return -1;
      case 4:
         if ((active0 & 0x288d14000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 4;
            return 1;
         }
         if ((active0 & 0x32003000L) != 0L)
            return 1;
         return -1;
      case 5:
         if ((active0 & 0x200414000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 5;
            return 1;
         }
         if ((active0 & 0x88900000L) != 0L)
            return 1;
         return -1;
      case 6:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 6;
            return 1;
         }
         if ((active0 & 0x200410000L) != 0L)
            return 1;
         return -1;
      case 7:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 7;
            return 1;
         }
         return -1;
      case 8:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 8;
            return 1;
         }
         return -1;
      case 9:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 9;
            return 1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x200000000000000L);
      case 37:
         return jjStopAtPos(0, 62);
      case 40:
         return jjStopAtPos(0, 41);
      case 41:
         return jjStopAtPos(0, 42);
      case 42:
         return jjStopAtPos(0, 60);
      case 43:
         return jjStopAtPos(0, 58);
      case 44:
         return jjStopAtPos(0, 48);
      case 45:
         return jjStopAtPos(0, 59);
      case 46:
         return jjStartNfaWithStates_0(0, 49, 25);
      case 47:
         jjmatchedKind = 61;
         return jjMoveStringLiteralDfa1_0(0xc0L);
      case 58:
         return jjStopAtPos(0, 50);
      case 59:
         return jjStopAtPos(0, 47);
      case 60:
         jjmatchedKind = 53;
         return jjMoveStringLiteralDfa1_0(0x80000000000000L);
      case 61:
         jjmatchedKind = 51;
         return jjMoveStringLiteralDfa1_0(0x40000000000000L);
      case 62:
         jjmatchedKind = 52;
         return jjMoveStringLiteralDfa1_0(0x100000000000000L);
      case 91:
         return jjStopAtPos(0, 45);
      case 93:
         return jjStopAtPos(0, 46);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x401000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x100206000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x240800000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x18000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0xc0000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x2001000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0xc000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x90100000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 123:
         return jjStopAtPos(0, 43);
      case 125:
         return jjStopAtPos(0, 44);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 47:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      case 61:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStopAtPos(1, 54);
         else if ((active0 & 0x80000000000000L) != 0L)
            return jjStopAtPos(1, 55);
         else if ((active0 & 0x100000000000000L) != 0L)
            return jjStopAtPos(1, 56);
         else if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 57);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x20d000000L);
      case 102:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(1, 18, 1);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x20200000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0xa000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 111:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0xc24000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x2001000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x2010000000L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x4202000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0xa2000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 114:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(2, 17, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x100008000L);
      case 116:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(2, 19, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x8010000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 119:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(2, 24, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x200001000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 100:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 1);
         break;
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(3, 15, 1);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x10010000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 108:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 37, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x20400000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 114:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 1);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x6000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000L);
      case 101:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(4, 29, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 107:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 1);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x110000L);
      case 114:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(4, 28, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000L);
      case 115:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 1);
         break;
      case 116:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 101:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 1);
         break;
      case 103:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(5, 20, 1);
         break;
      case 104:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(5, 31, 1);
         break;
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 110:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(5, 27, 1);
         break;
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(6, 22, 1);
         break;
      case 115:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(6, 16, 1);
         break;
      case 116:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(6, 33, 1);
         break;
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa10_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 114:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(10, 14, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 25;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 25:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(5, 6); }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     { jjCheckNAdd(4); }
                  }
                  break;
               case 0:
                  if ((0x800000d8ffffc9ffL & l) != 0L)
                  {
                     if (kind > 63)
                        kind = 63;
                     { jjCheckNAdd(2); }
                  }
                  else if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 34)
                        kind = 34;
                     { jjCheckNAddStates(0, 4); }
                  }
                  else if (curChar == 34)
                     { jjCheckNAddStates(5, 8); }
                  else if (curChar == 46)
                     { jjCheckNAddTwoStates(4, 5); }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if ((0x800000d8ffffc9ffL & l) == 0L)
                     break;
                  if (kind > 63)
                     kind = 63;
                  { jjCheckNAdd(2); }
                  break;
               case 3:
                  if (curChar == 46)
                     { jjCheckNAddTwoStates(4, 5); }
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  { jjCheckNAdd(4); }
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(5, 6); }
                  break;
               case 7:
                  if (curChar == 45)
                     { jjCheckNAdd(8); }
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  { jjCheckNAdd(8); }
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  { jjCheckNAddStates(0, 4); }
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  { jjCheckNAdd(10); }
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(11, 12); }
                  break;
               case 12:
                  if (curChar == 46)
                     { jjCheckNAdd(13); }
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  { jjCheckNAdd(13); }
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(14, 15); }
                  break;
               case 15:
                  if (curChar == 46)
                     { jjCheckNAdd(16); }
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 18:
                  if (curChar == 45)
                     { jjCheckNAdd(19); }
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  { jjCheckNAdd(19); }
                  break;
               case 20:
                  if (curChar == 34)
                     { jjCheckNAddStates(5, 8); }
                  break;
               case 21:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     { jjCheckNAddTwoStates(21, 22); }
                  break;
               case 22:
                  if (curChar == 34 && kind > 36)
                     kind = 36;
                  break;
               case 23:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     { jjCheckNAddTwoStates(23, 24); }
                  break;
               case 24:
                  if ((0x2400L & l) != 0L)
                     kind = 64;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     { jjCheckNAdd(1); }
                  }
                  else if ((0xd0000001d0000001L & l) != 0L)
                  {
                     if (kind > 63)
                        kind = 63;
                     { jjCheckNAdd(2); }
                  }
                  break;
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  { jjCheckNAdd(1); }
                  break;
               case 2:
                  if ((0xd0000001d0000001L & l) == 0L)
                     break;
                  if (kind > 63)
                     kind = 63;
                  { jjCheckNAdd(2); }
                  break;
               case 6:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 17:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 21:
                  { jjAddStates(9, 10); }
                  break;
               case 23:
                  { jjAddStates(11, 12); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 2:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 63)
                     kind = 63;
                  { jjCheckNAdd(2); }
                  break;
               case 21:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(9, 10); }
                  break;
               case 23:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(11, 12); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 25 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_2()
{
   return jjMoveNfa_2(0, 0);
}
private int jjMoveNfa_2(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 1;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x2400L & l) != 0L)
                     kind = 10;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1(){
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x100L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_1(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   10, 11, 12, 14, 15, 21, 22, 23, 24, 21, 22, 23, 24, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, 
"\142\162\145\141\153", "\143\154\141\163\163", "\143\157\156\163\164\162\165\143\164\157\162", 
"\145\154\163\145", "\145\170\164\145\156\144\163", "\146\157\162", "\151\146", "\151\156\164", 
"\163\164\162\151\156\147", "\143\150\141\162", "\142\157\157\154\145\141\156", 
"\144\157\165\142\154\145", "\156\145\167", "\160\162\151\156\164", "\162\145\141\144", 
"\162\145\164\165\162\156", "\163\165\160\145\162", "\167\150\151\154\145", "\144\157", 
"\163\167\151\164\143\150", "\143\141\163\145", "\144\145\146\141\165\154\164", null, null, null, 
"\156\165\154\154", null, null, null, "\50", "\51", "\173", "\175", "\133", "\135", "\73", "\54", 
"\56", "\72", "\75", "\76", "\74", "\75\75", "\74\75", "\76\75", "\41\75", "\53", 
"\55", "\52", "\57", "\45", null, null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 9)
       {
          jjmatchedKind = 9;
       }
       break;
     case 2:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_2();
       if (jjmatchedPos == 0 && jjmatchedKind > 11)
       {
          jjmatchedKind = 11;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 63 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    System.err.println("Line " + input_stream.getEndLine() +
                           " - Invalid string found: " + image);
    countLexError++;
         break;
      case 64 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    System.err.println("Line " + input_stream.getEndLine() +
                           " - String constant has a \u005c\u005cn: " + image);
    countLexError++;
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public langXTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public langXTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 25; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 3 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "multilinecomment",
   "singlelinecomment",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, 2, 0, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x7ffffe7ffffff001L, 0x0L, 
};
static final long[] jjtoSkip = {
   0x8000000000000ffeL, 0x1L, 
};
static final long[] jjtoSpecial = {
   0x8000000000000000L, 0x1L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[25];
    private final int[] jjstateSet = new int[2 * 25];

    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    
    protected char curChar;
}
