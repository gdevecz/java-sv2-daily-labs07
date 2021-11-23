package day02;

public class Movie {

    private String title;

    private int yearOfPublish;

    private String director;

    public Movie(String title, int yearOfPublish, String director) {
        this.title = title;
        this.yearOfPublish = yearOfPublish;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public String getDirector() {
        return director;
    }
}