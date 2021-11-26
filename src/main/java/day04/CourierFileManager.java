package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CourierFileManager {

    public Courier crateCourierByFile(Path path) {
        List<String> rowsFromFile;
        try {
            rowsFromFile = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file.", ioe);
        }
        return getCourierFromRows(rowsFromFile);
    }

    private Courier getCourierFromRows(List<String> rowsFromFile) {
        Courier courier = new Courier();
        for (String row : rowsFromFile) {
            String[] data = row.split(" ");
            courier.addRide(new Ride(
                    Integer.parseInt(data[0]),
                    Integer.parseInt(data[1]),
                    Integer.parseInt(data[2])))
            ;
        }
        return courier;
    }
}
