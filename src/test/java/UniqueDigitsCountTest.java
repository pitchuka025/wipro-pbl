import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UniqueDigitsCountTest {

    @Test
    void countsAllDistinctDigits() {
        assertEquals(4, UniqueDigitsCount.countUniqueDigits(1234));
        assertEquals(1, UniqueDigitsCount.countUniqueDigits(7));
    }

    @Test
    void countsDistinctDigitsWithRepeats() {
        assertEquals(3, UniqueDigitsCount.countUniqueDigits(112233));
        assertEquals(1, UniqueDigitsCount.countUniqueDigits(1111));
    }

    @Test
    void handlesNegativeNumbers() {
        assertEquals(3, UniqueDigitsCount.countUniqueDigits(-1213));
    }
}
