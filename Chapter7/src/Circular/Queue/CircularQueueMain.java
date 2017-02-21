package Circular.Queue;

/**
 * Created by jusk2 on 2017-02-21.
 */
public class CircularQueueMain {
  public static void main(String[] args) {
    CircularQueue circularQueue = new CircularQueue(4);

    boolean check =  circularQueue.enQueue(new Node(1));
    System.out.println(check);

    check = circularQueue.enQueue(new Node(2));
    System.out.println(check);

    check = circularQueue.enQueue(new Node(3));
    System.out.println(check);

    check =  circularQueue.enQueue(new Node(4));
    System.out.println(check);

    check =  circularQueue.enQueue(new Node(5));
    System.out.println(check);

    while (true) {
      Node node = new Node();
      node = circularQueue.deQueue();
      if (node != null) {
        System.out.println(node.getData());
      } else
        break;
    }
  }
}
