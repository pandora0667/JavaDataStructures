/**
 * Created by jusk2 on 2017-01-16.
 */

public class BSWorstOpCountExample {
  public static void main(String[] args) {
    BSWorstOpCount bsWorstOpCount = new BSWorstOpCount();

    int idx = bsWorstOpCount.BSearch(bsWorstOpCount.array1, 1, (bsWorstOpCount.array1.length)-1);
    if (idx != -1) {
      System.out.println("타켓 저장 인덱스 : " + idx);
    }else {
      System.out.println("탐색 실패");
    }

    idx = bsWorstOpCount.BSearch(bsWorstOpCount.array2, 2, (bsWorstOpCount.array2.length)-1);
    if (idx != -1) {
      System.out.println("타켓 저장 인덱스 : " + idx);
    }else {
      System.out.println("탐색 실패");
    }

    idx = bsWorstOpCount.BSearch(bsWorstOpCount.array3, 3, (bsWorstOpCount.array3.length)-1);
    if (idx != -1) {
      System.out.println("타켓 저장 인덱스 : " + idx);
    }else {
      System.out.println("탐색 실패");
    }
  }
}
