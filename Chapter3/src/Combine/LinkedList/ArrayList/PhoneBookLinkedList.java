package Combine.LinkedList.ArrayList;

/**
 * Created by jusk2 on 2017-01-30.
 */
public class PhoneBookLinkedList implements PhoneBookInterface {

  //Field
  private PhoneBookNode head;
  private PhoneBookNode tail;
  private PhoneBookNode phoneBookNode = new PhoneBookNode();

  //Constructor // head 더미노드 생성
  public PhoneBookLinkedList() {
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

  @Override
  public boolean addPhoneBook(String name, String phoneNumber) {
    PhoneBookNode tmpNode = new PhoneBookNode(name, phoneNumber);
    tail.setNextNode(tmpNode);
    tail = tmpNode;
    return true;
  }

  public void printAll() {
    PhoneBookNode tmpNode = head.getNextNode();

    while (tmpNode != null) {
      System.out.println("이름 : " + tmpNode.getName() + ", 전화번호 : " + tmpNode.getPhoneNumber());
      tmpNode = tmpNode.getNextNode();
    }
  }

  @Override
  public PhoneBookNode searchPhoneBook(String name) {
    return findLocate(name);
  }

  @Override
  public boolean modifyPhoneBook(String name, String phoneNumber) {
    PhoneBookNode findNode = findLocate(name);

    if (findNode != null) {
      findNode.setPhoneNumber(phoneNumber);
      return true;
    } else
      return false;
  }

  @Override
  public boolean deletePhoneBook(String name) {
    PhoneBookNode current = head.getNextNode();
    PhoneBookNode findNode = findLocate(name);
    PhoneBookNode prevNode = head;

    if (findNode != null) {
      while (current != findNode) {
        prevNode = current;
        findNode = current.getNextNode();
      }
      if (findNode == tail) {
        tail = prevNode;
      }
      prevNode.setNextNode(current.getNextNode());
      return true;
    }
    return false;
  }
}
