package com.aca.movieApp.user;

import com.aca.movieApp.movie.Genre;
import com.aca.movieApp.movie.Movie;
import com.aca.movieApp.movie.movieworkers.MovieRelatedPerson;

import java.time.LocalDate;
import java.util.List;

public class Admin extends User {
    public Admin(String userName, String password) {
        super(userName, password);
    }

    public void addTitle(Movie movie, String title) {
        movie.setTitle(title);
    }

    public void addArtists(Movie movie, List<MovieRelatedPerson> artists) {
        movie.setArtists(artists);
    }
    public void addGenre(Movie movie, Genre genre) {
        movie.setGenre(genre);
    }

    public void addDescription(Movie movie, String desc) {
        movie.setDescription(desc);
    }

    public void addPremierDate(Movie movie, LocalDate date) {
        movie.setPremierDate(date);
    }

    @Override
    public String toString() {

        return "the admin is " + this.getUserName();
    }
}
