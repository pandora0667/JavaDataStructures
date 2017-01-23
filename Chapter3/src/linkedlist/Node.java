package linkedlist;

/**
 * Created by jusk2 on 2017-01-24.
 */
public class Node {
  //Field
  private int data;
  private Node next;

  //Constructor
  public Node(){
  }

  public Node(int data){
    this.data = data;
  }

  //Class
  public void setData(int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getNext() {
    return next;
  }
}
