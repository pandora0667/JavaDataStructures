/**
 * Created by jusk2 on 2017-01-16.
 */
public class BinarySearch {
  //field
  int array[] = {1, 3, 5, 7, 9};

  //Method
  public int search(int target) {
    int first = 0;
    int last = array.length;

    while (first <= last) {
      int mid = (first+last)/2; // 탐색 대상의 중앙을 찾는다.

      if (target == array[mid]){
        return mid;
      }else {
        if (target < array[mid])
          last = mid-1;
        else
          first = mid+1;
      }
    }
    return -1; // 찾지 못했을때 반환됨
  }
}
