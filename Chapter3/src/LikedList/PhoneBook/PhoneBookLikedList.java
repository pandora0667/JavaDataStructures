package LikedList.PhoneBook;

/**
 * Created by jusk2 on 2017-01-24.
 */

public class PhoneBookLikedList {
  //Field
  private PhoneBookNode head;
  private PhoneBookNode tail;
  private PhoneBookNode phoneBookNode = new PhoneBookNode();

  //Constructor // head 더미노드 생성
  public PhoneBookLikedList() {
    head = phoneBookNode;
    tail = phoneBookNode;
  }

  // Class
  private PhoneBookNode findLocate(String name) {
    PhoneBookNode FindNode = head;

    while (FindNode != null) {
      if (FindNode.getName().equals(name)) {
        return FindNode;
      }
      FindNode = FindNode.getNextNode();
    }
    return null;
  }

  public void addPhoneBook(PhoneBookNode phoneBookNode) {
    tail.setNextNode(phoneBookNode);
    tail = phoneBookNode;
  }

  public void printAll() {
    PhoneBookNode tmpNode = head.getNextNode();

    while (tmpNode != null) {
      System.out.println("이름 : " + tmpNode.getName() + ", 전화번호 : " + tmpNode.getPhoneNumber());
      tmpNode = tmpNode.getNextNode();
    }
  }

  public PhoneBookNode searchPhoneBook(String name) {
    return findLocate(name);
  }

  public boolean modifyPhoneBook(String name, String phoneNumber) {
    PhoneBookNode findNode = findLocate(name);

    if (findNode != null) {
      findNode.setPhoneNumber(phoneNumber);
      return true;
    } else
      return false;
  }

  public boolean deletePhoneBook(String name) {
    PhoneBookNode findNode = findLocate(name);
    PhoneBookNode prevNode = head;
    PhoneBookNode current = head.getNextNode();

      if (findNode != null) {
        while (current != findNode) {
          prevNode = current;
          findNode = current.getNextNode();
        }
        prevNode.setNextNode(current.getNextNode());

        if (findNode == tail) { // 마지막 노드
          tail = prevNode;
        }
        return true;
      }
    return false;
  }
}
