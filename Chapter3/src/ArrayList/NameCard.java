package ArrayList;

/**
 * Created by jusk2 on 2017-01-30.
 */
public class NameCard {
  //Field
  private String name;
  private String phoneNumber;

  //Constructor
  public NameCard() {

  }
  public NameCard(String name, String phoneNumber) {
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
}
