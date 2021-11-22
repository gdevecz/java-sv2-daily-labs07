package day01;

public class NameValidator {

    public boolean isNameValid(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name is blank!");
        }
        if (!(name.substring(1, name.length() - 1).contains(" "))) {
            throw new IllegalArgumentException("The name is invalid!");
        }
        return true;
    }
}
