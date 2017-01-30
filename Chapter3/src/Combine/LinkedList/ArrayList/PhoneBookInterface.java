package Combine.LinkedList.ArrayList;

/**
 * Created by jusk2 on 2017-01-30.
 */
public interface PhoneBookInterface {

  // 추상 메소드
  boolean addPhoneBook(String name, String phoneNumber);
  void printAll();
  PhoneBookNode searchPhoneBook(String name);
  boolean modifyPhoneBook(String name, String phoneNumber);
  boolean deletePhoneBook(String name);


}
