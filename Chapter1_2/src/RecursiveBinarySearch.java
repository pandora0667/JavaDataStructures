/**
 * Created by jusk2 on 2017-01-16.
 */
public class RecursiveBinarySearch {
  //field
  int array[] = {1, 3, 5, 7, 9};
  int idx;


  //Method
  public int BSearchEecur(int inputFirst, int inputLast, int target) {
    int first = inputFirst;
    int last = inputLast;
    int mid = (first + last)/2;

    if (first > last)
      return -1;

    if (array[mid] == target)
      return mid;
    else if(target < array[mid])
      return BSearchEecur(first, mid-1, target);
    else
      return BSearchEecur(mid+1, last, target);
  }

}
