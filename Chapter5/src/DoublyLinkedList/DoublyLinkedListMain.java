package DoublyLinkedList;

/**
 * Created by jusk2 on 2017-01-31.
 */
public class DoublyLinkedListMain {
  public static void main(String[] args) {
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

    doublyLinkedList.addData(new DoublyLinkedListNode(1));
    doublyLinkedList.addData(new DoublyLinkedListNode(2));
    doublyLinkedList.addData(new DoublyLinkedListNode(3));
    doublyLinkedList.addData(new DoublyLinkedListNode(4));
    doublyLinkedList.addData(new DoublyLinkedListNode(5));

    doublyLinkedList.printAll();

    System.out.println();
    if (doublyLinkedList.deleteNode(3)) {
      System.out.println("잘 지웠어요");
      doublyLinkedList.printAll();
    } else
      System.out.println("못지웠어요ㅠㅠ");
  }
}
