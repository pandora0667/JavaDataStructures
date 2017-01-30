package Combine.LinkedList.ArrayList;

import java.util.Scanner;

/**
 * Created by jusk2 on 2017-01-30.
 */
public class PhoneBookMain {
  public static void main(String[] args) {
    PhoneBookInterface phoneBook = new PhoneBookLinkedList() ;

    Scanner scanner = new Scanner(System.in);
    boolean run = true;

    System.out.println("전화번호부 배열리스트 + 연결리스트 V2.0");
/*    System.out.println("1. 연결리스트 | 2. 배열리스트 || 선택 -> ");
    int select = scanner.nextInt();

    switch (select) {
      case 1:
        System.out.println("링크드 리스트를 생성합니다.");
        phoneBook = new PhoneBookLinkedList();
        break;

      case 2:
        System.out.println("길이가 3인 배열 리스트를 생성합니다.");
        phoneBook = new PhoneBookArrayList(3);
        break;

      default:
        System.out.println("다시 입력하세요. ");
    }
*/

    while (run) {
      System.out.println("----------------------------------------------------------------------------------------------");
      System.out.println("| 1. 정보입력 | 2. 이름검색 | 3. 전화번호 수정 | 4. 전화번호 삭제 | 5. 모두 출력 | 6. 나가기 |");
      System.out.println("----------------------------------------------------------------------------------------------");
      System.out.println();

      System.out.print("입력 -> ");
      int select = scanner.nextInt();

      switch (select) {
        case 1:  // 정보입력
          System.out.print("이름, 전화번호 입력 -> ");
          String name = scanner.next();
          String phoneNumber = scanner.next();

          if (phoneBook.addPhoneBook(name, phoneNumber))
            System.out.println("정보가 입력되었습니다.");
          else
            System.out.println("저장할 수 없습니다. 다시 확인해 주세요.");
          break;

        case 2:  // 이름검색
          System.out.print("이름 : ");
          name = scanner.next();

          if (phoneBook.searchPhoneBook(name) != null) {
            System.out.println("이름 : " + phoneBook.searchPhoneBook(name).getName());
            System.out.println("전화번호 : " + phoneBook.searchPhoneBook(name).getPhoneNumber());
          } else
            System.out.println("해당 사용자가 존재하지 않습니다.");
          break;

        case 3:  // 전화번호 수정
          System.out.print("이름 : ");
          name = scanner.next();
          System.out.print(name + "의 변경할 전화번호 입력 -> ");
          phoneNumber = scanner.next();

          if (phoneBook.modifyPhoneBook(name, phoneNumber))
            System.out.println("정상적으로 수정되었습니다.");
          else
            System.out.println("해당사용자가 존재하지 않습니다.");
          break;

        case 4:  // 전화번호 삭제
          System.out.print("이름 : ");
          name = scanner.next();

          if (phoneBook.deletePhoneBook(name))
            System.out.println("삭제되었습니다.");
          else
            System.out.println("삭제 실패했습니다. 사용자를 다시 확인하세요.");
          break;

        case 5:  // 모두출력
          phoneBook.printAll();
          break;

        case 6:
          run = false;
          break;

        default:
          System.out.println("잘못 입력되었습니다. 다시 입력하세요!!");
      }
    }
  }
}
