package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {


    private List<Ride> rides = new ArrayList<>();


    public Courier() {
    }

    public Courier(List<Ride> rides) {
        this.rides.addAll(rides);
    }

    public void addRide(Ride ride ){
        if(rides.size() != 0 && !rides.get(rides.size() - 1).isBefore(ride)) {
            throw new IllegalArgumentException("The ride is invalid.");
        }
        rides.add(ride);
    }

    public List<Ride> getRides() {
        return rides;
    }
}
