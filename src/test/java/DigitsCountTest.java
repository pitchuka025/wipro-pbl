import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DigitsCountTest {

    @Test
    void countsDigitsOfPositive() {
        assertEquals(1, DigitsCount.countDigits(7));
        assertEquals(4, DigitsCount.countDigits(1234));
        assertEquals(3, DigitsCount.countDigits(100));
    }

    @Test
    void zeroHasOneDigit() {
        assertEquals(1, DigitsCount.countDigits(0));
    }

    @Test
    void countsDigitsOfNegative() {
        assertEquals(4, DigitsCount.countDigits(-1234));
    }
}
