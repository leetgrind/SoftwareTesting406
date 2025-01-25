import org.example.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    @Test
    void fib_0_returns_0() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.calculate(0);
        assertEquals(0, result);
    }

    @Test
    void fib_10_returns_55() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.calculate(100);
        assertEquals(55, result);
    }

    @Test
    void fib_negativeNumber() {
        Fibonacci fibonacci = new Fibonacci();
        assertThrows(IllegalArgumentException.class, () -> fibonacci.calculate(-10));
    }

}
