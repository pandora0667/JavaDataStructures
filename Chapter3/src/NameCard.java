/**
 * Created by jusk2 on 2017-01-23.
 */
public class NameCard {

  //field
  private String name;
  private String phone;

  //Constructor
  public NameCard(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
