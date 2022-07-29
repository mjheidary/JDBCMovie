package com.mapsahr;


public class Movie {
    private int id;
    private String title;
    private Integer year;
    private String imdb;
    private Genre genres;
    private Director director;


    public Movie() {
    }

    public Movie(String title, Integer year, String imdb, Genre genres, Director director) {
        this.title = title;
        this.year = year;
        this.imdb = imdb;
        this.genres = genres;
        this.director = director;
    }

    // getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public Genre getGenres() {
        return genres;
    }

    public void setGenres(Genre genres) {
        this.genres = genres;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", year=" + year + "]";
    }
}
