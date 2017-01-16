/**
 * Created by jusk2 on 2017-01-16.
 */
public class RecursiveFunc {

  public void Recursive(int num) {
    if (num <= 0)
      return;

    System.out.println("Recursive call!!  " + num);
    Recursive((num-1));
  }
}
