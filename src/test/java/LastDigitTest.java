import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LastDigitTest {

    @Test
    void returnsLastDigitOfPositive() {
        assertEquals(4, LastDigit.getLastDigit(1234));
        assertEquals(0, LastDigit.getLastDigit(100));
        assertEquals(7, LastDigit.getLastDigit(7));
    }

    @Test
    void returnsAbsoluteLastDigitOfNegative() {
        assertEquals(4, LastDigit.getLastDigit(-1234));
        assertEquals(9, LastDigit.getLastDigit(-9));
    }
}
