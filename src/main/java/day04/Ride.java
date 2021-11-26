package day04;

public class Ride {

    private int day;

    private int numberOfRide;

    private int kms;

    public Ride(int day, int numberOfRide, int kms) {
        this.day = day;
        this.numberOfRide = numberOfRide;
        this.kms = kms;
    }

    public boolean isValidNext(Ride previousRide) {
        if (day < previousRide.getDay()) {
            return false;
        }
        if (day == previousRide.getDay()
                && numberOfRide != previousRide.getNumberOfRide() + 1) {
            return false;
        }
        if (day > previousRide.getDay() && numberOfRide != 1) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return day + ", " + numberOfRide + ", " + kms;
    }

    public int getDay() {
        return day;
    }

    public int getNumberOfRide() {
        return numberOfRide;
    }

    public int getKms() {
        return kms;
    }
}
