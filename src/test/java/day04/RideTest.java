package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RideTest {


    @Test
    void testCreate() {
        Ride ride = new Ride(1, 3, 2);

        assertEquals(1, ride.getDay());
        assertEquals(3, ride.getNumberOfRide());
        assertEquals(2, ride.getKms());
    }

    @Test
    void isBefore() {
        Ride ride = new Ride(1, 3, 2);
        Ride ride2 = new Ride(2, 1, 2);
        Ride ride3 = new Ride(5, 2, 2);

        assertEquals(false, ride.isValidNext(ride));
        assertEquals(false, ride.isValidNext(ride2));
        assertEquals(false, ride.isValidNext(ride3));
        assertEquals(true, ride2.isValidNext(ride));
        assertEquals(false, ride2.isValidNext(ride2));
        assertEquals(false, ride2.isValidNext(ride3));
        assertEquals(false, ride3.isValidNext(ride));
        assertEquals(false, ride3.isValidNext(ride2));
        assertEquals(false, ride3.isValidNext(ride3));
    }

}