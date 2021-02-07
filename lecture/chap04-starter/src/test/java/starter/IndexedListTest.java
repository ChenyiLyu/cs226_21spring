package starter;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class IndexedListTest {
 private IndexedList apples;
 private final static int size = 2;
 private final static String defaultValue = "fuji";

 @BeforeEach
 void setUp() {
   apples = new ArrayIndexedList<>(size, defaultValue);
 }
  @Test
  @DisplayName("length() returns the size value after IndexedList is instantiated.")
  void testLengthAfterConstruction() {
    assertEquals(2, apples.length());
  }
  @Test
  @DisplayName("get() returns the default value after IndexedList is instantiated.")
  void testGetAfterConstruction() {
    for (int i = 0; i < apples.length(); i++) {
      assertEquals("fuji", apples.get(i));
    }
  }

  @Test
  @DisplayName("put() changes the default value after IndexedList is instantiated.")
  void testPutChangesValueAfterConstruction() {
    apples.put(1, "CrispyHoney");
    assertEquals("CrispyHoney", apples.get(1));
  }

  @Test
  @DisplayName("put() overwrites the existing value at given index to provided value.")
  void testPutUpdatesValueAtGivenIndex() {
    apples.put(1, "CrispyHoney");
    assertEquals("CrispyHoney", apples.get(1));
    apples.put(1, "avacado");
    assertEquals("avacado", apples.get(1));
  }
}