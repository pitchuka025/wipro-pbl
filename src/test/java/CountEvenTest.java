import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountEvenTest {

    @Test
    void countsAllEven() {
        assertEquals(5, CountEven.countEven(2, 4, 6, 8, 10));
    }

    @Test
    void countsNoEven() {
        assertEquals(0, CountEven.countEven(1, 3, 5, 7, 9));
    }

    @Test
    void countsMixed() {
        assertEquals(3, CountEven.countEven(1, 2, 3, 4, 6));
    }

    @Test
    void treatsZeroAndNegativesAsEven() {
        assertEquals(3, CountEven.countEven(0, -2, 1, -4, 3));
    }
}
