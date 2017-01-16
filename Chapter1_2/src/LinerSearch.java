/**
 * Created by jusk2 on 2017-01-16.
 */
public class LinerSearch {
  //field
  int array[] = {3, 5, 2, 4, 9};

  public int lSearch(int target) {

    for (int i=0; i<array.length; i++) {
      if (array[i] == target)
        return i;
    }
    return -1;
  }
}
