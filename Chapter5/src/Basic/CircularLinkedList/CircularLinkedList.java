package Basic.CircularLinkedList;

/**
 * Created by jusk2 on 2017-01-31.
 */
public class CircularLinkedList {
  //Field
  private CircularLinkedListNode head;
  private CircularLinkedListNode tail;
  private int length;

  //Constructor
  public CircularLinkedList() {
//    head = null;
    tail = null;
    length = 0;
  }


  public void add(CircularLinkedListNode node) {
    length++;
    if (tail == null) {
//      head = node;
      tail = node;
      tail.setNext(tail);
    } else {
      node.setNext(tail.getNext());
      tail.setNext(node);
      tail = node;
    }
  }

  private CircularLinkedListNode findLocate(int data) {
    CircularLinkedListNode findNode = tail.getNext();
    for (int i=0; i<length; i++) {
      if (findNode.getData() == data) {
        return findNode;
      }
      findNode = findNode.getNext();
    }
    return null;
  }

  public void printAll() {
    CircularLinkedListNode tmpNode = tail.getNext();
    for (int i=0; i<length; i++) {
      System.out.print(tmpNode.getData() + ", ");
      tmpNode = tmpNode.getNext();
    }
  }

  public boolean deleteData(int data) {
    CircularLinkedListNode findNode = findLocate(data);
    CircularLinkedListNode currentNode = tail.getNext();
    CircularLinkedListNode prevNode = tail;

    while (currentNode != findNode) {
      prevNode = currentNode;
      currentNode = currentNode.getNext();
    }
    prevNode.setNext(findNode.getNext());
    length--;

    return true;
  }
}

