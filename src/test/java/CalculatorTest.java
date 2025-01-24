import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd() {
        //Arrange
        Calculator calculator = new Calculator();

        //Act
        int result = calculator.add(2, 2);

        //Assert
        assertEquals(4, result);
    }

}
