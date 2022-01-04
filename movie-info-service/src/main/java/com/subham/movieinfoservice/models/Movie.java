package com.subham.movieinfoservice.models;

/**
 * @author subham.mallick
 * @date: 04/01/22
 */
public class Movie {
    private String movieId;
    private String name;

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getName() {
        return name;
    }

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }
}
