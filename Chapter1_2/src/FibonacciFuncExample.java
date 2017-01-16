/**
 * Created by jusk2 on 2017-01-16.
 */
public class FibonacciFuncExample {
  public static void main(String[] args) {
    FibonacciFunc fibonacciFunc = new FibonacciFunc();

    for (int i=1; i<15; i++) {
      System.out.print(fibonacciFunc.fibonacci(i) + ", ");
    }
  }
}
