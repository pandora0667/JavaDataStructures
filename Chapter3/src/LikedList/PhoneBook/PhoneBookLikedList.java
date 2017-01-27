package LikedList.PhoneBook;

/**
 * Created by jusk2 on 2017-01-24.
 */

public class PhoneBookLikedList {
  //Field
  private PhoneBookNode head;
  private PhoneBookNode tail;

  //Constructor
  public PhoneBookLikedList() {
    head = null;
    tail = null;
  }

  // Class
  public void addPhoneBook(PhoneBookNode phoneBookNode) {
    if (head == null) {
      head = phoneBookNode;
      tail = phoneBookNode;
    } else {
      tail.setNextNode(phoneBookNode);
      tail = phoneBookNode;
    }
  }

  public void printAll() {
    PhoneBookNode tmpNode = head;

    while (tmpNode != null) {
      System.out.println("이름 : " + tmpNode.getName() + ", 전화번호 : " + tmpNode.getPhoneNumber());
      tmpNode = tmpNode.getNextNode();
    }
  }

  public void searchPhoneBook(String name) {
    PhoneBookNode tmpNode = head;

    while (tmpNode != null) {
      if (tmpNode.getName().equals(name)) {
        System.out.println("이름 : " + tmpNode.getName() + ", 전화번호 : " + tmpNode.getPhoneNumber());
      }
      tmpNode = tmpNode.getNextNode();
    }
  }

  public void modifyPhoneBook(String name, String phoneNumber) {
    PhoneBookNode tmpNode = head;

    while (tmpNode != null) {
      if (tmpNode.getName().equals(name)) {
        tmpNode.setPhoneNumber(phoneNumber);
      }
      tmpNode = tmpNode.getNextNode();
    }
  }

  public void deletePhoneBook(String name) {
    PhoneBookNode tmpNode = head;
    PhoneBookNode prevNode = head;
    PhoneBookNode current = head.getNextNode();

    while (tmpNode != null) {
      if (tmpNode.getName().equals(name)) {

        if (tmpNode == head) { // 첫번째 노드
          head = head.getNextNode();
          break;
        } else if (current != tmpNode) {
          prevNode = current;
          current = current.getNextNode();
        }
        prevNode.setNextNode(current.getNextNode());

        if (tmpNode == tail) { // 마지막 노드
          tail = prevNode;
        }
      }
      tmpNode = tmpNode.getNextNode();
    }
     System.out.println("삭제 되었습니다.");
  }
}