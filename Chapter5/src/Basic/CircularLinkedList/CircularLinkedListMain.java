package Basic.CircularLinkedList;

import java.util.Scanner;

/**
 * Created by jusk2 on 2017-01-31.
 */
public class CircularLinkedListMain {
  public static void main(String[] args) {
    CircularLinkedList circularLinkedList = new CircularLinkedList();
    Scanner scanner = new Scanner(System.in);

    circularLinkedList.add(new CircularLinkedListNode(1));
    circularLinkedList.add(new CircularLinkedListNode(2));
    circularLinkedList.add(new CircularLinkedListNode(3));
    circularLinkedList.add(new CircularLinkedListNode(4));

    System.out.println("----- 전체 데이터 조회 -----");
    circularLinkedList.printAll();

    System.out.println();
    System.out.println("----- 선택 데이터 삭제 -----");
    System.out.print("삭제하고 싶은 데이터 입력  : ");
    int findData = scanner.nextInt();
    if (circularLinkedList.deleteData(findData)){
      System.out.println("정상적으로 삭제되었습니다.");
      circularLinkedList.printAll();
    } else
      System.out.println("데이터를 찾을 수 없거나 삭제할 수 없습니다.");

  }
}
