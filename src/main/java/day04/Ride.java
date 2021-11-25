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

    public boolean isBefore(Ride antoherRide) {
        if (day > antoherRide.getDay()) {
            return false;
        }
        if (day == antoherRide.getDay() && numberOfRide > antoherRide.getNumberOfRide()) {
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
