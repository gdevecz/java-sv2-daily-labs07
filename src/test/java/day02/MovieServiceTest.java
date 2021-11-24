package day02;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
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
        String filePath = "src/test/resources/day02/WRONG.csv";
        Path path = Paths.get(filePath);
        IOException exceptedIOException = new IOException(path.toString());
        NoSuchFileException expectedNoSuchFileException = new NoSuchFileException(path.toString());
        String expectedIOEMessage = exceptedIOException.getMessage();
        String expectedNSFEMessage = expectedNoSuchFileException.getMessage();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new MovieService(path));
//        System.out.println(filePath);
//        System.out.println(path);
//        System.out.println(expectedIOEMessage);
//        System.out.println(expectedNoSuchFileException.getMessage());
//        System.out.println(exception.getCause().getMessage());

        assertEquals("Can not read file!", exception.getMessage());
        assertEquals(NoSuchFileException.class, exception.getCause().getClass());
//        nem jó, valószínű hívási lánc vagy öröklés
//        assertEquals(exceptedIOException.getClass(), exception.getCause().getClass());
//        Mivel itt nincs NoSuchFile, getCause()==null
//        assertEquals(exceptedIOException.getCause().getClass(), exception.getCause().getClass());

//       A lényeg:  assertEquals tesztek getCause().getMessage()-ra.
        assertEquals(new IOException(path.toString()).getMessage(), exception.getCause().getMessage());
        assertEquals(new NoSuchFileException(path.toString()).getMessage(), exception.getCause().getMessage());
        assertEquals(exceptedIOException.getMessage(), exception.getCause().getMessage());
        assertEquals(expectedNoSuchFileException.getMessage(), exception.getCause().getMessage());
        assertEquals(expectedIOEMessage, exception.getCause().getMessage());
        assertEquals(expectedNSFEMessage, exception.getCause().getMessage());
        assertEquals(path.toString(),exception.getCause().getMessage());
    }
}