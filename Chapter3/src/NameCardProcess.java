import java.util.Scanner;

/**
 * Created by jusk2 on 2017-01-23.
 */
  public class NameCardProcess {
  private static NameCard[] nameCard = new NameCard[3];
  private static Scanner scanner = new Scanner(System.in);

  public static void nameInput() {
    System.out.print("이름, 전화번호 입력 -> ");
    String name = scanner.next();
    String phone = scanner.next();

    NameCard newNameCard = new NameCard(name, phone);

    for (int i=0; i<nameCard.length; i++) {
      if (nameCard[i] == null) {
        nameCard[i] = newNameCard;
        System.out.println("정보가 입력되었습니다.");
        System.out.println(i+1 + ". " + " 이름 : " + nameCard[i].getName() + ", 전화번호 : " + nameCard[i].getPhone());
        return;
      }
    }
  }

  public static void nameSearch() {
    System.out.print("이름 -> ");
    String name = scanner.next();

    for (int i = 0; i < nameCard.length; i++) {
      if (nameCard[i].getName().equals(name)) {
        System.out.println(nameCard[i].getName() + ", " + nameCard[i].getPhone());
        return;
      } else if (nameCard[i] == null)
        continue;
      else {
        System.out.println("저장된 정보가 없습니다.");
        return;
      }
    }
  }

  public static void phoneModify() {
    System.out.print("이름 -> ");
    String name = scanner.next();

    for (int i=0; i<nameCard.length; i++) {
      if(nameCard[i].getName().equals(name)) {
        System.out.print(nameCard[i].getName() + "의 전화번호 입력 -> ");
        String phone = scanner.next();
        nameCard[i].setPhone(phone);
        break;
      }else if (nameCard[i] == null)
        continue;
      else{
        System.out.println("저장된 정보가 없습니다.");
        return;
      }
    }
  }

  public static void delete() {
    System.out.print("이름 -> ");
    String name = scanner.next();

    for (int i=0; i<nameCard.length; i++) {
      if(nameCard[i].getName().equals(name)) {
        nameCard[i] = null;
        System.out.println("삭제 되었습니다.");
        break;
      }else if (nameCard[i] == null)
        continue;
      else{
        System.out.println("저장된 정보가 없습니다.");
        return;
      }
    }
  }

  public static void allPrint() {
    for (int i=0; i<nameCard.length; i++) {
      if(nameCard[i] != null) {
        System.out.println(i + 1 + " 이름 : " + nameCard[i].getName() + ", 전화번호 : " + nameCard[i].getPhone());
        continue;
      }
    }
  }
}
