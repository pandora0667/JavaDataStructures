package LinkedList.Stack;

import java.util.Scanner;

/**
 * Created by jusk2 on 2017-02-06.
 */
public class LinkedListMain {
  public static void main(String[] args) {
    LinkedListStack likedListStack = new LinkedListStack();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("데이터 입력 (-1 나가기)-> ");
      int data = scanner.nextInt();
      if (data == -1)
        break;
      likedListStack.stackPush(new LinkedListNode(data));
    }


    System.out.println();
    System.out.println("Peek 데이터 출력" + likedListStack.stackPeek().getData());
    System.out.println();

    System.out.println("데이터를 Pop 합니다.");

    try {
      while (true) {
        System.out.println(likedListStack.stackPop().getData());
      }
    } catch (NullPointerException e) {
      System.out.println("데이터를 모두 출력했습니다.");
    }
  }
}
