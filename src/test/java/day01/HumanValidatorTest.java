package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanValidatorTest {

    HumanValidator hv = new HumanValidator();

    @Test
    void testNameIsValid() {
        boolean result = hv.checkValidData("John Doe", 1990);

        assertEquals(true, result);
    }

    @Test
    void testNameIsNull() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> hv.checkValidData(null, 1990));

        assertEquals("The name is blank!", exception.getMessage());
    }

    @Test
    void testNameIsBlank() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> hv.checkValidData("   ",1990));

        assertEquals("The name is blank!", exception.getMessage());
    }

    @Test
    void testNameIsInvalid() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> hv.checkValidData(" John",1990));
        assertEquals("The name is invalid!", exception.getMessage());
    }

    @Test
    void testCreateInValidAge() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> hv.checkValidData("John Doe", 1880));

        assertEquals("The age is invalid!", exception.getMessage());
    }
}