package com.mapsahr;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws SQLException {
        MovieService movieService = new MovieService();
        List<Movie> movies = movieService.findAllMovies();

        Map<String, Long> directorMovieCounts =
                movies.stream()
                        .map(Movie::getDirector)
                        .collect(Collectors.groupingBy(Director::getName, Collectors.counting()));
        directorMovieCounts.entrySet().forEach(System.out::println);
    }
}
