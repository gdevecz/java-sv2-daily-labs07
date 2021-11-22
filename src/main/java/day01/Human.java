package day01;

import java.time.LocalDate;
import java.time.Year;

public class Human {

    private String name;

    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        if (!isNameValid(name)) {
            throw new IllegalArgumentException("The name is invalid!");
        }
        if (!isAgeValid(yearOfBirth)) {
            throw new IllegalArgumentException("The age is invalid!");
        }
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    private boolean isNameValid(String name) {
        if(name.isBlank()) {
            return false;
        }
        if (name.substring(1, name.length() - 1).contains(" ")) {
            return true;
        }
        return false;
    }

    private boolean isAgeValid(int age) {
        return LocalDate.now().getYear() - yearOfBirth >= 120;
    }
}
