package hw1;

import exceptions.NegativeIntegerException;

public class Task {

  /**
   * Determines whether the input is even or not.
   *
   * @param num a non-negative integer
   * @return true if num is even and false otherwise.
   * @throws NegativeIntegerException when num is negative.
   */

  public static boolean isEven(int num) {
    if (num < 0) {
      throw new NegativeIntegerException();
    }
    return num % 2 == 0;

  }
}