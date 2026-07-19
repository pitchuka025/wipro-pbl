import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RangeTest {

    @Test
    void isPrimeHelperWorks() {
        assertFalse(Range.isPrime(1));
        assertTrue(Range.isPrime(2));
        assertTrue(Range.isPrime(17));
        assertFalse(Range.isPrime(21));
    }

    @Test
    void countsPrimesInRange() {
        assertEquals(4, Range.countPrimesInRange(1, 10));
        assertEquals(8, Range.countPrimesInRange(1, 20));
    }

    @Test
    void handlesRangeWithNoPrimes() {
        assertEquals(0, Range.countPrimesInRange(14, 16));
    }

    @Test
    void handlesSingleValueRange() {
        assertEquals(1, Range.countPrimesInRange(13, 13));
        assertEquals(0, Range.countPrimesInRange(12, 12));
    }
}
