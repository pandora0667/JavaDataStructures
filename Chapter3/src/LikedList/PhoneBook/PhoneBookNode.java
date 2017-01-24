package LikedList.PhoneBook;

/**
 * Created by jusk2 on 2017-01-24.
 */
public class PhoneBookNode {
  //Field
  private String name;
  private String phoneNumber;
  private PhoneBookNode nextNode;


  //Constructor
  public PhoneBookNode() {
  }

  public PhoneBookNode(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  //Class
  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PhoneBookNode getNextNode() {
    return nextNode;
  }

  public void setNextNode(PhoneBookNode nextNode) {
    this.nextNode = nextNode;
  }
}