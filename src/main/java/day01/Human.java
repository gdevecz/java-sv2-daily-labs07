package day01;

import java.time.LocalDate;

public class Human {

    private String name;

    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        if(checkValidData(name, yearOfBirth)) {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    private boolean checkValidData(String name, int yearOfBirth) {
        return isNameValid(name) && isAgeValid(yearOfBirth);
    }

    private boolean isNameValid(String name) {
        if (name == null || name.isBlank()) {
            return false;
        }
        if (name.substring(1, name.length() - 1).contains(" ")) {
            return true;
        }
        return false;
    }

    private boolean isAgeValid(int yearOfBirth) {
        return LocalDate.now().getYear() - yearOfBirth >= 120;
    }
}
