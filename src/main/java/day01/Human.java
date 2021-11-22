package day01;

public class Human {

    private String name;

    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        HumanValidator hv = new HumanValidator();
        if (hv.checkValidData(name, yearOfBirth)) {
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
}
