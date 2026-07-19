import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountEvenOrOddTest {

    @Test
    void countsEven() {
        assertEquals(3, CountEvenOrOdd.countEven(1, 2, 3, 4, 6));
        assertEquals(0, CountEvenOrOdd.countEven(1, 3, 5, 7, 9));
    }

    @Test
    void countsOdd() {
        assertEquals(2, CountEvenOrOdd.countOdd(1, 2, 3, 4, 6));
        assertEquals(5, CountEvenOrOdd.countOdd(1, 3, 5, 7, 9));
    }

    @Test
    void evenPlusOddEqualsTotal() {
        int even = CountEvenOrOdd.countEven(1, 2, 3, 4, 5);
        int odd = CountEvenOrOdd.countOdd(1, 2, 3, 4, 5);
        assertEquals(5, even + odd);
    }
}
