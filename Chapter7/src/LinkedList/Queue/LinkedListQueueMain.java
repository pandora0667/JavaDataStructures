package LinkedList.Queue;

/**
 * Created by jusk2 on 2017-02-21.
 */
public class LinkedListQueueMain {
  public static void main(String[] args) {
    LinkedListQueue linkedListQueue = new LinkedListQueue();

    linkedListQueue.enQueue(new Node(1));
    linkedListQueue.enQueue(new Node(2));
    linkedListQueue.enQueue(new Node(3));
    linkedListQueue.enQueue(new Node(4));

    while (true) {
      Node tmpNode = linkedListQueue.deQueue();
      if (tmpNode != null) {
        System.out.println(tmpNode.getData());
      } else
        break;
    }



  }
}
