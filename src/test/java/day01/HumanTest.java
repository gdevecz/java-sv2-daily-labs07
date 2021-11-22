package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testCreate() {
        Human human = new Human("John Doe", 1990);

        assertEquals("John Doe", human.getName());
        assertEquals(1990, human.getYearOfBirth());
    }


    @Test
    void testCreateBlankName() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("  ", 1990));

        assertEquals("The name is blank!", exception.getMessage());
    }

    @Test
    void testCreateWrongName() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human(" John ", 1990));

        assertEquals("The name is invalid!", exception.getMessage());
    }

    @Test
    void testCreateWrongAge() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("John  Doe", 1810));

        assertEquals("The age is invalid!", exception.getMessage());
    }

    @Test
    void testCreateNullName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human(null, 1990));

        assertEquals("The name is blank!", exception.getMessage());
    }


}