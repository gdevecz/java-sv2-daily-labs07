package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RideTest {


    @Test
    void testCreate() {
        Ride ride = new Ride(1,3,2);

        assertEquals(1,ride.getDay());
        assertEquals(3,ride.getNumberOfRide());
        assertEquals(2,ride.getKms());
    }

    @Test
    void isBefore() {
        Ride ride = new Ride(1,3,2);
        Ride ride2 = new Ride(2,3,2);

        assertEquals(true, ride.isBefore(ride2));
        assertEquals(false, ride2.isBefore(ride));
    }

}