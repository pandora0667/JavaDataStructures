package Combine.LinkedList.ArrayList;

/**
 * Created by jusk2 on 2017-01-30.
 */
public class PhoneBookArrayList implements PhoneBookInterface {

  private PhoneBookNode[] phoneBookNode;

  public PhoneBookArrayList(int length) {
    phoneBookNode = new PhoneBookNode[length];
  }

  private int findLocate(String name) {
    try {
      for (int i=0; i<phoneBookNode.length; i++) {
        if (phoneBookNode[i].getName().equals(name) && phoneBookNode != null) {
          return i;
        }
      }
    } catch (NullPointerException e) {
      System.out.println("NullPointerException 발생");
    }
    return -1;
  }

  @Override
  public boolean addPhoneBook(String name, String phoneNumber) {
    PhoneBookNode newNameCard = new PhoneBookNode(name, phoneNumber);
    for (int i=0; i<phoneBookNode.length; i++) {
      if (phoneBookNode[i] == null) {
        phoneBookNode[i] = newNameCard;
        return true;
      }
    }
    return false;
  }

  @Override
  public PhoneBookNode searchPhoneBook(String name) {
    int locate = findLocate(name);
    if (locate != -1) {
      return phoneBookNode[locate];
    } else
      return null;
  }

  @Override
  public void printAll() {
    for (PhoneBookNode print : phoneBookNode) {
      if (print != null)
        System.out.println("이름 : " + print.getName() + " 전화번호 : " + print.getPhoneNumber());
    }
  }

  @Override
  public boolean modifyPhoneBook(String name, String phoneNumber) {
    int locate = findLocate(name);
    if (locate != -1) {
      phoneBookNode[locate].setPhoneNumber(phoneNumber);
      return true;
    } else
      return false;
  }

  @Override
  public boolean deletePhoneBook(String name) {
    int locate = findLocate(name);
    if (locate != -1) {
      phoneBookNode[locate] = null;
      return true;
    } else
      return false;
  }
}
