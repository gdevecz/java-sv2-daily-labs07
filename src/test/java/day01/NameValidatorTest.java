package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {

    NameValidator nv = new NameValidator();

    @Test
    void testNameIsValid() {
        boolean result = nv.isNameValid("John Doe");

        assertEquals(true, result);
    }

    @Test
    void testNameIsNull() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> nv.isNameValid(null));

        assertEquals("The name is blank!", exception.getMessage());
    }

    @Test
    void testNameIsBlank() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> nv.isNameValid(" "));

        assertEquals("The name is blank!", exception.getMessage());
    }

    @Test
    void testNamisInvalid() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> nv.isNameValid(" John"));
        assertEquals("The name is invalid!", exception.getMessage());
    }
}