import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IsOddTest {

    @Test
    void returnsTwoForOddNumbers() {
        assertEquals(2, IsOdd.isOdd(1));
        assertEquals(2, IsOdd.isOdd(9));
        assertEquals(2, IsOdd.isOdd(-5));
    }

    @Test
    void returnsOneForEvenNumbers() {
        assertEquals(1, IsOdd.isOdd(0));
        assertEquals(1, IsOdd.isOdd(2));
        assertEquals(1, IsOdd.isOdd(-8));
    }
}
