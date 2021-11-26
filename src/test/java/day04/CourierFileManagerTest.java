package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class CourierFileManagerTest {

    CourierFileManager cfm = new CourierFileManager();
    @Test
    void TestCrateCourierByFile() {
        Path path = Paths.get("src/main/resources/day04/rides.txt");
        Courier courier = cfm.crateCourierByFile(path);
        Ride expectedRide = new Ride(4,1,19);

        assertEquals(6, courier.getRides().size());
        assertEquals(expectedRide.toString(), courier.getRides().get(3).toString());
    }

    @Test
    void TestCreateCourierByFileFailed() {
        Path path = Path.of("src/main/resources/day04/wrong.txt");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> cfm.crateCourierByFile(path));

        assertEquals("Can not read file: " + path, exception.getMessage());
        assertEquals(NoSuchFileException.class, exception.getCause().getClass());
    }
}