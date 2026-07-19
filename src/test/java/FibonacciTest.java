import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    void nonPositiveReturnsZero() {
        assertEquals(0, Fibonacci.nthFibonacci(0));
        assertEquals(0, Fibonacci.nthFibonacci(-5));
    }

    @Test
    void firstFibonacciIsOne() {
        assertEquals(1, Fibonacci.nthFibonacci(1));
    }

    @Test
    void computesSequence() {
        assertEquals(1, Fibonacci.nthFibonacci(2));
        assertEquals(2, Fibonacci.nthFibonacci(3));
        assertEquals(5, Fibonacci.nthFibonacci(5));
        assertEquals(55, Fibonacci.nthFibonacci(10));
    }
}
