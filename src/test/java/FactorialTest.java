import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void factorialOfBaseCases() {
        assertEquals(1L, Factorial.factorial(0));
        assertEquals(1L, Factorial.factorial(1));
    }

    @Test
    void factorialOfSmallNumbers() {
        assertEquals(2L, Factorial.factorial(2));
        assertEquals(120L, Factorial.factorial(5));
        assertEquals(3628800L, Factorial.factorial(10));
    }

    @Test
    void factorialHandlesLargeValueWithinLong() {
        assertEquals(2432902008176640000L, Factorial.factorial(20));
    }

    @Test
    void factorialOfNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}
