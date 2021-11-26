package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {

        if (rides.size() != 0 && !ride.isValidNext(getLastRide())) {
            throw new IllegalArgumentException("The ride is invalid.");
        }
        rides.add(ride);
    }

    private Ride getLastRide() {
        return rides.get(rides.size() - 1);
    }

    public List<Ride> getRides() {
        return rides;
    }
}
