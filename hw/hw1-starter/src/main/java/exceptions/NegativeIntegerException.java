package exceptions;

/**
 * Exception for cases where input is expected to be non-negative.
 */
public class NegativeIntegerException extends RuntimeException {

  /**
   * Constructs a new NegativeIntegerException.
   */
  public NegativeIntegerException() {
  }

  /**
   * Constructs a new NegativeIntegerException with
   * the specified detail message.
   *
   * @param message the detail message. The detail message is saved for
   *                later retrieval by the getMessage() method.
   */
  public NegativeIntegerException(String message) {
    super(message);
  }
}