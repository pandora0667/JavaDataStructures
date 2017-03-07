package ArrayList.Stack;

import java.util.Scanner;

/**
 * Created by jusk2 on 2017-02-06.
 */
public class ArrayListStackMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayListStack arrayListStack = new ArrayListStack(3);
    boolean run = true;

    while (run) {
      System.out.print("데이터 입력 -> ");
      int data = scanner.nextInt();

      run = arrayListStack.push(new ArrayListStackNode(data));
    }

    System.out.println();
    System.out.println("peek 확인 : " + arrayListStack.peek().getData());
    System.out.println();

    System.out.println("데이터를 POP 합니다.");

    while (true) {
      ArrayListStackNode node = arrayListStack.pop();
      if (node != null)
        System.out.println(node.getData());
      else
        break;
    }
  }
}
