package Basic.CircularLinkedList;

/**
 * Created by jusk2 on 2017-01-31.
 */
public class CircularLinkedListNode {
  //Field
  private int data;
  private CircularLinkedListNode next;

  //Constructor
  public CircularLinkedListNode() {
  }

  public CircularLinkedListNode(int data) {
    this.data = data;
  }

  //Class
  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public void setNext(CircularLinkedListNode next) {
    this.next = next;
  }

  public CircularLinkedListNode getNext() {
    return next;
  }
}
