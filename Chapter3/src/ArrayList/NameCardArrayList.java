package ArrayList;

/**
 * Created by jusk2 on 2017-01-30.
 */
public class NameCardArrayList {
  private NameCard[] arrayNameCard;

  //Constructor
  public NameCardArrayList(int length) {
    arrayNameCard = new NameCard[length];
  }

  private int findLocate(String name) {
    for (int i = 0; i < arrayNameCard.length; i++) {
      if (arrayNameCard[i].getName().equals(name)) {
        return i;
      }
    }
    return -1;
  }

  public boolean addPhoneBook(String name, String phoneNumber) {
    NameCard newNameCard = new NameCard(name, phoneNumber);
    for (int i = 0; i < arrayNameCard.length; i++) {
      if (arrayNameCard[i] == null) {
        arrayNameCard[i] = newNameCard;
        return true;
      }
    }
    return false;
  }

  public NameCard searchPhoneBook(String name) {
    int locate = findLocate(name);
    if (locate != -1) {
      return arrayNameCard[locate];
    } else
      return null;
  }

  public void printAll() {
    for (int i = 0; i < arrayNameCard.length; i++) {
      if (arrayNameCard[i] != null)
        System.out.println("이름 : " + arrayNameCard[i].getName() + " 전화번호 : " + arrayNameCard[i].getPhoneNumber());
      continue;
    }
  }

  public boolean modifyPhoneBook(String name, String phoneNumber) {
    int locate = findLocate(name);
    if (locate != -1) {
      arrayNameCard[locate].setPhoneNumber(phoneNumber);
      return true;
    } else
      return false;
  }

  public boolean deletePhoneBook(String name) {
    int locate = findLocate(name);
    if (locate != -1) {
      arrayNameCard[locate] = null;
      return true;
    } else
      return false;
  }
}
