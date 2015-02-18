import java.util.ArrayList;
import java.util.List;

/**
 * Created by amytakayesu on 2/18/15.
 */
public class ProjectEulerThree {
  public static void main(String[] args) {
    long num = 600851475143L;
    List<Long> factors = new ArrayList();
    long divider = 2;
    while(num > 1){
      while ((num % divider) == 0) {
        factors.add(divider);
        num /= divider;
      }
      divider += 1;
    }
    System.out.println(factors.get(factors.size() - 1));
  }
}
