import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IsEvenTest {

    @Test
    void returnsTwoForEvenNumbers() {
        assertEquals(2, IsEven.isEven(0));
        assertEquals(2, IsEven.isEven(2));
        assertEquals(2, IsEven.isEven(100));
        assertEquals(2, IsEven.isEven(-4));
    }

    @Test
    void returnsOneForOddNumbers() {
        assertEquals(1, IsEven.isEven(1));
        assertEquals(1, IsEven.isEven(7));
        assertEquals(1, IsEven.isEven(-3));
    }
}
