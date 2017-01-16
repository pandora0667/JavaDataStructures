/**
 * Created by jusk2 on 2017-01-16.
 */
public class RecursiveFactorialExample {
  public static void main(String[] args) {
    RecursiveFactorial recursiveFactorial = new RecursiveFactorial();

    System.out.println("1! = " + recursiveFactorial.factorial(1));
    System.out.println("2! = " + recursiveFactorial.factorial(2));
    System.out.println("3! = " + recursiveFactorial.factorial(3));
    System.out.println("4! = " + recursiveFactorial.factorial(4));
    System.out.println("9! = " + recursiveFactorial.factorial(9));
  }
}
