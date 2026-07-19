import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountOddTest {

    @Test
    void countsAllOdd() {
        assertEquals(5, CountOdd.countOdd(1, 3, 5, 7, 9));
    }

    @Test
    void countsNoOdd() {
        assertEquals(0, CountOdd.countOdd(2, 4, 6, 8, 10));
    }

    @Test
    void countsMixed() {
        assertEquals(2, CountOdd.countOdd(1, 2, 3, 4, 6));
    }

    @Test
    void treatsNegativeOddAsOdd() {
        assertEquals(2, CountOdd.countOdd(-1, -2, -3, 4, 6));
    }
}
