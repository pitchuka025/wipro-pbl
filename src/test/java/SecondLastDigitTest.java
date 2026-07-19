import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SecondLastDigitTest {

    @Test
    void returnsSecondLastDigit() {
        assertEquals(3, SecondLastDigit.getSecondLastDigit(1234));
        assertEquals(0, SecondLastDigit.getSecondLastDigit(105));
        assertEquals(1, SecondLastDigit.getSecondLastDigit(10));
    }

    @Test
    void returnsMinusOneForSingleDigit() {
        assertEquals(-1, SecondLastDigit.getSecondLastDigit(5));
        assertEquals(-1, SecondLastDigit.getSecondLastDigit(0));
    }

    @Test
    void handlesNegativeNumbers() {
        assertEquals(3, SecondLastDigit.getSecondLastDigit(-1234));
        assertEquals(-1, SecondLastDigit.getSecondLastDigit(-7));
    }
}
