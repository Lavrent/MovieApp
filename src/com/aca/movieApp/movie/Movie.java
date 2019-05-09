package com.aca.movieApp.movie;

import java.time.LocalDate;

public class Movie {
    private String title;
    private String description;
    private double average_rating;
    private String premierDate;
    private String genre;
    private String actor;
    private String director;
    private String writer;
    private int number_of_users_rated;


    public String getTitle() {
        return title;
    }

    public Movie(String title, String description, double average_rating, String premierDate,
                 String genre, String actor, String director, String writer) {
        this.title = title;
        this.description = description;
        this.average_rating = average_rating;
        this.premierDate = premierDate;
        this.genre = genre;
        this.actor = actor;
        this.director = director;
        this.writer = writer;
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

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setWriter(String writer) {
        this.writer = writer;
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

    public String getGenre() {
        return genre;
    }

    public String getActor() {
        return actor;
    }

    public String getDirector() {
        return director;
    }

    public String getWriter() {
        return writer;
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
                "\nactor - " + actor +
                "\ndirector - " + director +
                "\nwriter - " + writer;
    }
}
