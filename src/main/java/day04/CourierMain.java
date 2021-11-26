package day04;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CourierMain {

    public static void main(String[] args) {
        CourierFileManager cm = new CourierFileManager();

        Path path = Paths.get("src/main/resources/day04/rides.txt");
        Courier courier = cm.crateCourierByFile(path);

        System.out.println(courier.getRides());
        //courier.addRide(new Ride(1,1,1));
    }
}
