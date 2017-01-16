import java.util.Scanner;

/**
 * Created by jusk2 on 2017-01-16.
 */
public class BinarySearchExample {
  public static void main(String[] args) {

    BinarySearch binarySearch = new BinarySearch();
    boolean run = true;
    Scanner scanner = new Scanner(System.in);

    while (run) {
      System.out.println("찾고자 하는 값을 입력하세요");

      int target = scanner.nextInt();
      int result = binarySearch.search(target);

      if (result != -1) {
        System.out.println("타겟 저장 인덱스 :" + result);
      }else{
        System.out.println("찾고자 하는 인덱스 값이 없음");
      }
    }
  }
}

