package com.aca.movieApp.movie;

import com.aca.movieApp.movie.movieworkers.MovieRelatedPerson;

import java.util.List;

public class Movie {
    private String title;
    private String description;
    private double average_rating;
    private String premierDate;
    private Genre genre;
    private List<MovieRelatedPerson> artists;
    private int number_of_users_rated;

    public Movie(String title, String description, double average_rating, String premierDate,
                 Genre genre, List<MovieRelatedPerson> artists) {
        this.title = title;
        this.description = description;
        this.average_rating = average_rating;
        this.premierDate = premierDate;
        this.genre = genre;
        this.artists = artists;
    }



    public String getTitle() {
        return title;
    }

    public double getAverage_rating() {
        return average_rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public List<MovieRelatedPerson> getArtists() {
        return artists;
    }

    public int getNumber_of_users_rated() {
        return number_of_users_rated;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAverage_rating(double average_rating) {
        this.average_rating = average_rating;
    }

    public void setNumber_of_users_rated(int number_of_users_rated) {
        this.number_of_users_rated = number_of_users_rated;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPremierDate(String premierDate) {
        this.premierDate = premierDate;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setArtists(List<MovieRelatedPerson> artists) {
        this.artists = artists;
    }

    public String getDescription() {
        return description;
    }

    public double getRating() {
        return average_rating;
    }

    public String getPremierDate() {
        return premierDate;
    }


    public int getNumberOfUsersRated() {
        return number_of_users_rated;
    }

    @Override
    public String toString() {
        return "title - " + title +
                "\ndescription - " + description +
                "\naverage_rating - " + average_rating +
                "\npremierDate - " + premierDate +
                "\ngenre - " + genre +
                "\nartists - " + artists;
    }
}
