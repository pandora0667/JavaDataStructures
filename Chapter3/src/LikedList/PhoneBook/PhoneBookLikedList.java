package LikedList.PhoneBook;

import java.util.Scanner;

/**
 * Created by jusk2 on 2017-01-24.
 */

public class PhoneBookLikedList {
  Scanner scanner = new Scanner(System.in);
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

  public void modifyPhoneBook(String name) {
    PhoneBookNode tmpNode = head;

    while (tmpNode != null) {
      if (tmpNode.getName().equals(name)) {
        System.out.print(tmpNode.getName() + "의 전화번호 입력 -> ");
        String phoneNumber = scanner.next();
        tmpNode.setPhoneNumber(phoneNumber);
      }
      tmpNode = tmpNode.getNextNode();
    }
  }

  public void deletePhoneBook(String name) {
    PhoneBookNode tmpNode = head;

    while (tmpNode != null) {
      if (tmpNode.getName().equals(name)) {

        if (tmpNode == head) { // 첫번째 노드
          head = head.getNextNode();
          break;
        }

        PhoneBookNode prevNode = head;
        PhoneBookNode current = head.getNextNode();

        while (current != tmpNode) {
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