import java.util.Scanner;

/**
 * Created by jusk2 on 2017-01-16.
 */
public class RecursiveBinarySearchExample {
  public static void main(String[] args) {
    RecursiveBinarySearch recursiveBinarySearch = new RecursiveBinarySearch();
    Scanner scanner = new Scanner(System.in);

    boolean run = true;
    while (run){
      System.out.println("찾고자 하는 값을 입력하세요");
      int target = scanner.nextInt();
      recursiveBinarySearch.idx = recursiveBinarySearch.BSearchEecur(0, recursiveBinarySearch.array.length-1, target);

      if (recursiveBinarySearch.idx !=-1)
        System.out.println("타겟저장 인덱스 : " + recursiveBinarySearch.idx);
      else
        System.out.println("탐색 실패");
    }
  }
}
