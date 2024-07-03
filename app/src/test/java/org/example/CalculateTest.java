package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testSumRoop() {
    Calculate calculate = new Calculate();
    assertEquals(5, calculate.sum_roop(2, 3, 0)); // 2 + 3
    assertEquals(55, calculate.sum_roop(1, 10, 0)); // 1 + 2 + ... + 10
    assertEquals(25, calculate.sum_roop(1, 10, 1)); // 1 + 3 + 5 + 7 + 9 (odd)
    assertEquals(30, calculate.sum_roop(1, 10, 2)); // 2 + 4 + 6 + 8 + 10 (even)
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    assertEquals(2.5, calculate.average(2, 3), 0.001); // (2 + 3) / 2
    assertEquals(5.5, calculate.average(1, 10), 0.001); // (1 + 2 + ... + 10) / 10
  }// assertEqualsの0.001は許容誤差
}
