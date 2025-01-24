import org.example.ReverseString;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseStringTest {


    @ParameterizedTest
    @CsvSource({
            "hello,olleh",
            "abc,cba"
    })
    void testReverseStringNonEmptyString(String input, String expected) {

        //Arrange
        ReverseString reverseString = new ReverseString();

        //Act
        String result = reverseString.reverse(input);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    void testReverseNullString() {

        //Arrange
        ReverseString reverseString = new ReverseString();

        //Act
        String result = reverseString.reverse(null);
        //Assert;
        assertNull(result);

    }

}
