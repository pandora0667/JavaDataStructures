/**
 * Created by jusk2 on 2017-01-16.
 */
public class RecursiveFactorial {

  public int factorial (int n) {
    if (n==0)
      return 1;
    else
      return n * factorial(n-1);
  }
}
