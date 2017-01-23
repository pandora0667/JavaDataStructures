import java.util.Scanner;

/**
 * Created by jusk2 on 2017-01-23.
 */

public class NameCardExample {
  private static Scanner scanner  = new Scanner(System.in);

  public static void main(String[] args) {
    boolean run = true;

    while (run) {
      System.out.println("----------------------------------------------------------------------------------------------");
      System.out.println("| 1. 정보입력 | 2. 이름검색 | 3. 전화번호 수정 | 4. 전화번호 삭제 | 5. 모두 출력 | 6. 나가기 |");
      System.out.println("----------------------------------------------------------------------------------------------");
      System.out.println();

      System.out.print("입력 -> ");
      int select  = scanner.nextInt();

      switch (select) {
        case 1:  // 정보입력
          NameCardProcess.nameInput();
          break;
        case 2:  // 이름검색
          NameCardProcess.nameSearch();
          break;
        case 3:  // 전화번호 수정
          NameCardProcess.phoneModify();
          break;
        case 4:  // 전화번호 삭제
          NameCardProcess.delete();
          break;
        case 5:  // 모두출력
          NameCardProcess.allPrint();
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
