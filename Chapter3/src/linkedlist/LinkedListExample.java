package linkedlist;

/**
 * Created by jusk2 on 2017-01-24.
 */
    public class LinkedListExample {
      public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(new Node(1));
        linkedList.add(new Node(2));
        linkedList.add(new Node(3));
        linkedList.add(new Node(5));

        linkedList.printAll();

  }
}
