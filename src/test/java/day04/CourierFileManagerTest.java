package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class CourierFileManagerTest {

    CourierFileManager cm = new CourierFileManager();
    @Test
    void TestCrateCourierByFile() {
        Path path = Paths.get("src/main/resources/day04/rides.txt");
        Courier courier = cm.crateCourierByFile(path);
        Ride expectedRide = new Ride(4,1,19);

        assertEquals(6, courier.getRides().size());
        assertEquals(expectedRide.toString(), courier.getRides().get(3).toString());
    }

    @Test
    void TestCreateCourierByFileFailed() {
        Path path = Path.of("wrong.txt");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> cm.crateCourierByFile(path));

        assertEquals("Can not read file.", exception.getMessage());
        assertEquals(NoSuchFileException.class, exception.getCause().getClass());
    }
}