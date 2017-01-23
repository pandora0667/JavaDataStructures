package linkedlist;

/**
 * Created by jusk2 on 2017-01-24.
 */
public class LinkedList {

  private Node head;
  private Node tail;

  public LinkedList(){
    head = null;
    tail = null;
  }

  public void add(Node node){
    if(head == null) {
      head = node;
      tail = node;
    } else {
      tail.setNext(node);
      tail = node;
    }
  }

  public void printAll() {
    Node tmpNode = head;
    while (tmpNode != null) {
      System.out.println(tmpNode.getData());
      tmpNode = tmpNode.getNext();
    }
  }
}
