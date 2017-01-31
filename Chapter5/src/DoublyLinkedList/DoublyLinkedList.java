package DoublyLinkedList;

/**
 * Created by jusk2 on 2017-01-31.
 */
public class DoublyLinkedList {
  //Field
  private DoublyLinkedListNode head;
  private DoublyLinkedListNode tail;

  //Constructor
  public DoublyLinkedList() {
    head = new DoublyLinkedListNode();
    tail = new DoublyLinkedListNode();
    head.setNext(tail);
    tail.setPrev(head);
  }

  //Class
  private DoublyLinkedListNode findLocate(int data) {
    DoublyLinkedListNode findNode = head.getNext();
    while (findNode != tail) {
      if (findNode.getData() == data)
        return findNode;
      findNode = findNode.getNext();
    }
    return null;
  }

  public void addData(DoublyLinkedListNode node) {
   node.setPrev(tail.getPrev());
   node.setNext(tail);
   tail.getPrev().setNext(node);
   tail.setPrev(node);
  }

  public void printAll() {
    DoublyLinkedListNode tmpNode = tail.getPrev();
    while (tmpNode != head) {
      System.out.print(tmpNode.getData() + ", ");
      tmpNode = tmpNode.getPrev();
    }
  }

  public boolean deleteNode(int data) {
    DoublyLinkedListNode findNode = findLocate(data);
    if (findNode != null) {
      findNode.getPrev().setNext(findNode.getNext());
      findNode.getNext().setPrev(findNode.getPrev());
      return true;
    }
    return false;
  }
}
