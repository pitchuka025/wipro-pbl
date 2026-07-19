import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NthPrimeTest {

    @Test
    void isPrimeHelperWorks() {
        assertFalse(NthPrime.isPrime(1));
        assertTrue(NthPrime.isPrime(2));
        assertFalse(NthPrime.isPrime(15));
    }

    @Test
    void returnsNthPrime() {
        assertEquals(2, NthPrime.nthPrime(1));
        assertEquals(3, NthPrime.nthPrime(2));
        assertEquals(11, NthPrime.nthPrime(5));
        assertEquals(29, NthPrime.nthPrime(10));
    }

    @Test
    void nonPositiveThrows() {
        assertThrows(IllegalArgumentException.class, () -> NthPrime.nthPrime(0));
        assertThrows(IllegalArgumentException.class, () -> NthPrime.nthPrime(-2));
    }
}
