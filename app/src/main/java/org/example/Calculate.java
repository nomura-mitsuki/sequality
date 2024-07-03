package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  // xからyまでの合計
  public int sum_roop(int x, int y, int mode) {
    int sum_odd = 0;
    int sum_even = 0;

    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        sum_even = i + sum_even;
      } else if (i % 2 == 1) {
        sum_odd = i + sum_odd;
      }
    }

    // 1の時奇数の合計，2の時偶数の合計
    if (mode == 1) {
      return sum_odd;
    } else if (mode == 2) {
      return sum_even;
    }

    // 0の時の合計
    return sum_odd + sum_even;
  }

  // xからyまでの平均
  public double average(int x, int y) {
    double sum = 0;
    sum = this.sum_roop(x, y, 0);
    double ave = sum / (y - x + 1);
    return ave;
  }
}
