package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void testCreate() {
        Path path = Paths.get("src/test/resources/day02/movies.csv");
        MovieService ms = new MovieService(path);

        assertEquals(5, ms.getMovies().size());
        assertEquals("Jurassic park", ms.getMovies().get(0).getTitle());
    }

    @Test
    void testCreateFail() {
        Path path = Paths.get("src/test/resources/day02/Wrong.csv");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new MovieService(path));

        assertEquals("Can not read file!", exception.getMessage());
    }
}