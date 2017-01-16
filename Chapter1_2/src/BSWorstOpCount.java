/**
 * Created by jusk2 on 2017-01-16.
 */
public class BSWorstOpCount {
  //field
  int[] array1 = new int[500];
  int[] array2 = new int[5000];
  int[] array3 = new int[50000];

  //Method;
  public int BSearch (int[] array, int target, int inputLast) {
    int first = 0;
    int last = inputLast;
    int mid;
    int opCount = 0;

    while (first <= last) {
      mid = (first+last)/2;

      if (target == array[mid])
        return mid;
      else {
        if (target < array[mid])
          last = mid-1;
        else
          first = mid+1;
      }
      opCount += 1;
    }
    System.out.println("비교연산횟수 : " + opCount);
    return -1;
  }
}



