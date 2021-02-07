package hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskTest {

  @Test
  @DisplayName("isEven works for even input")
  public void worksForEvenInput() {
    assertTrue(Task.isEven(4));
  }

  // You are not expected to write tests for this homework, but feel free to do so!
}
