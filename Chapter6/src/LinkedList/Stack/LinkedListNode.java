package LinkedList.Stack;

/**
 * Created by jusk2 on 2017-02-06.
 */


public class LinkedListNode {
  //field
  private int data;
  private LinkedListNode prev;

  //Constructor
  public LinkedListNode() {}

  public LinkedListNode(int data) {
    this.data = data;
  }

  //Class
  public int getData() {
    return data;
  }

  public void setPrev(LinkedListNode node) {
    this.prev = node;
  }

  public LinkedListNode getPrev() {
    return prev;
  }
}
