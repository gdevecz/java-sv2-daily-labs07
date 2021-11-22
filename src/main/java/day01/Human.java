package day01;

public class Human {

    private String name;

    private int age;

    public Human(String name, int age) {
        if (!isNameValid(name)) {
            throw new IllegalArgumentException("The name is invalid!");
        }
        if (!isAgeValid(age)) {
            throw new IllegalArgumentException("The age is invalid!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
        return age <= 120;
    }
}
