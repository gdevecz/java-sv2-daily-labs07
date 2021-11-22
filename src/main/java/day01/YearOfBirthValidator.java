package day01;

import java.time.LocalDate;

public class YearOfBirthValidator {

    public boolean isAgeValid(int yearOfBirth) {
        if (LocalDate.now().getYear() - yearOfBirth >= 120) {
            throw new IllegalArgumentException("The age is invalid!");
        }
        return true;
    }
}
