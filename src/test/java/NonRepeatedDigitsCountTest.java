import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NonRepeatedDigitsCountTest {

    @Test
    void allDigitsUniqueCountsAll() {
        assertEquals(4, NonRepeatedDigitsCount.countNonRepeatedDigits(1234));
        assertEquals(1, NonRepeatedDigitsCount.countNonRepeatedDigits(7));
    }

    @Test
    void excludesRepeatedDigits() {
        assertEquals(2, NonRepeatedDigitsCount.countNonRepeatedDigits(1123));
        assertEquals(0, NonRepeatedDigitsCount.countNonRepeatedDigits(1122));
    }

    @Test
    void handlesNegativeNumbers() {
        assertEquals(2, NonRepeatedDigitsCount.countNonRepeatedDigits(-1213));
    }
}
