import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Tests Project Euler Three.
 *
 * @author amytakayesu
 */
public class ProjectEulerThreeTest {

  /**
   * Test the compute prime factors method using default value.
   *
   * @throws Exception
   */
  @Test
  public void testComputePrimeFactors() throws Exception {
    List<Long> factors = ProjectEulerThree.computePrimeFactors(600851475143L);
    assertEquals("Test using default number", 6857, (long) factors.get(factors.size() - 1));
  }
}