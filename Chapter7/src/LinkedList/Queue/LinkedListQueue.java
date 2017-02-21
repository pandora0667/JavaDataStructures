package LinkedList.Queue;

/**
 * Created by jusk2 on 2017-02-21.
 */
public class LinkedListQueue {
  private Node front;
  private Node rear;
  private int length;

  //Constructor
  public LinkedListQueue() {
    this.front = null;
    this.rear = null;
    length = 0;
  }

  private boolean empty() {
    if (front == null)
      return true;
    else
      return false;
  }

  public void enQueue(Node tmpNode) {
    if (empty()) {
      front = tmpNode;
      rear = tmpNode;
    } else {
      rear.setNext(tmpNode);
      rear = tmpNode;
    }
  }

  public Node deQueue() {
    Node tmpNode = front;

    try {
      front = front.getNext();
    } catch (NullPointerException e) {
      System.out.println("더이상 데이터가 존재하지 않습니다");
      return null;
    }
    return tmpNode;
  }
}
