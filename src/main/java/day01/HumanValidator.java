package day01;

public class HumanValidator {

    public boolean checkValidData(String name, int yearOfBirth) {
        NameValidator nv = new NameValidator();
        YearOfBirthValidator yobv = new YearOfBirthValidator();
        return nv.isNameValid(name) && yobv.isAgeValid(yearOfBirth);
    }
}
