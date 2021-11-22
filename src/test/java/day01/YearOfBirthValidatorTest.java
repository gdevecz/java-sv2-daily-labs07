package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearOfBirthValidatorTest {

    YearOfBirthValidator yobv = new YearOfBirthValidator();
    @Test
    void testValid() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> yobv.isAgeValid(1820));

        assertEquals("The age is invalid!", exception.getMessage());
    }
}