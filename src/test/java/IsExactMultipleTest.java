import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IsExactMultipleTest {

    @Test
    void returnsTwoWhenExactMultiple() {
        assertEquals(2, IsExactMultiple.isExactMultiple(10, 5));
        assertEquals(2, IsExactMultiple.isExactMultiple(0, 7));
        assertEquals(2, IsExactMultiple.isExactMultiple(-9, 3));
    }

    @Test
    void returnsOneWhenNotExactMultiple() {
        assertEquals(1, IsExactMultiple.isExactMultiple(10, 3));
        assertEquals(1, IsExactMultiple.isExactMultiple(7, 2));
    }

    @Test
    void returnsOneForZeroDivisor() {
        assertEquals(1, IsExactMultiple.isExactMultiple(10, 0));
    }
}
