package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public MovieService(Path path) {
        try {
            loadMovies(path);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file!");
        }
    }

    public List<Movie> getMovies() {
        return movies;
    }

    private void loadMovies(Path path) throws IOException {
        List<String> rows = Files.readAllLines(path);
        movies = fillListOfMovies(rows);
    }

    private List<Movie> fillListOfMovies(List<String> rows) {
        List<Movie> movies = new ArrayList<>();
        for (String row : rows) {
            movies.add(getMovieFromRow(row));
        }
        return movies;
    }

    private Movie getMovieFromRow(String row) {
        String[] tmp = row.split(";");
        return new Movie(tmp[0], Integer.parseInt(tmp[1]), tmp[2]);
    }
}
