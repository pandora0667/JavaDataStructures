package LinkedList.Stack;

/**
 * Created by jusk2 on 2017-02-06.
 */
public class LinkedListStack {

  private LinkedListNode top;

  public LinkedListStack() {}

  public void stackPush(LinkedListNode node) {
    if (top == null) {
      top = node;
    } else {
      LinkedListNode tmpNode = top;
      top = node;
      top.setPrev(tmpNode);
    }
  }

  public LinkedListNode stackPop() {
    LinkedListNode tmpNode = top;
    top = top.getPrev();
    return tmpNode;
  }

  public LinkedListNode stackPeek() {
    return top;
  }
}
