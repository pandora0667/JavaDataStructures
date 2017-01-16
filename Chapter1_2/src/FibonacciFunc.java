/**
 * Created by jusk2 on 2017-01-16.
 */
public class FibonacciFunc {

  public int fibonacci (int n) {

    if (n==1)
      return 0;
    else if(n==2)
      return 1;
    else
      return fibonacci(n-1) + fibonacci(n-2);
  }
}
