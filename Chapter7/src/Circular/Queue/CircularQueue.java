package Circular.Queue;

/**
 * Created by jusk2 on 2017-02-21.
 */
public class CircularQueue {
  private int front;
  private int rear;
  private Node[] nodes;

  //Constructor
  public CircularQueue(int length) {
    nodes = new Node[length];
    front = 0;
    rear = 0;
  }

  private boolean full() {
    if (rear == nodes.length-1)
      return true;
    else
      return false;
  }

  public boolean enQueue(Node tmpNode) {
    if (!full()) {
      nodes[++rear] = tmpNode;
      return true;
    } else
      return false;
  }

  public Node deQueue() {
    front++;
    if (front > rear) {
      rear = 0;
      front = 0;
      return null;
    } else {
      return nodes[front];
    }
  }

}
