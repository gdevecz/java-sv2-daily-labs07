package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testCreate() {
        Human human = new Human("John Doe", 33);

        assertEquals("John Doe", human.getName());
        assertEquals(33, human.getAge());
    }


    @Test
    void testCreateBlankName() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("  ", 33));

        assertEquals("The name is invalid!", exception.getMessage());
    }

    @Test
    void testCreateWrongName() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human(" John ", 33));

        assertEquals("The name is invalid!", exception.getMessage());
    }

    @Test
    void testCreateWrongAge() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("John  Doe", 133));

        assertEquals("The age is invalid!", exception.getMessage());
    }
}