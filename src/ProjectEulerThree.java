import java.util.ArrayList;
import java.util.List;

/**
 * Project Euler Three
 * Created by amytakayesu on 2/18/15.
 */
public class ProjectEulerThree {
  /**
   * Calls computePrimeFactors method and send in a long number parameter.
   * @param args not used
   */
  public static void main(String[] args) {
    long num = 600851475143L;
    List<Long> factors = computePrimeFactors(num);
    System.out.println(factors.get(factors.size() - 1));
  }

  /**
   * Computes the largest prime factor of num.
   * @param num the number to find prime factors of.
   * @return list of prime factors
   */
  public static List<Long> computePrimeFactors(long num) {
    List<Long> factors = new ArrayList();
    long divider = 2;
    while (num > 1) {
      while ((num % divider) == 0) {
        factors.add(divider);
        num /= divider;
      }
      divider += 1;
    }
    return factors;
  }
}
