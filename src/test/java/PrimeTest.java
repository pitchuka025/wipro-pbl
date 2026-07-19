import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PrimeTest {

    @Test
    void numbersUpToOneAreNotPrime() {
        assertFalse(Prime.isPrime(-3));
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
    }

    @Test
    void twoAndThreeArePrime() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
    }

    @Test
    void identifiesPrimes() {
        assertTrue(Prime.isPrime(7));
        assertTrue(Prime.isPrime(13));
        assertTrue(Prime.isPrime(97));
    }

    @Test
    void identifiesComposites() {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(9));
        assertFalse(Prime.isPrime(100));
    }
}
