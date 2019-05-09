package com.aca.movieApp.user;

import com.aca.movieApp.movie.Movie;

public class User {
    private String userName; // unique
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "userName - " + userName + " \t" + "password - " + password;
    }

    public void rateMovie(Movie movie, int rating) {
        int numberOfUsers = movie.getNumberOfUsersRated() + 1;
        double averageRating = (movie.getNumberOfUsersRated() * movie.getRating() + rating) / numberOfUsers;
        movie.setAverage_rating(averageRating);
        movie.setNumber_of_users_rated(numberOfUsers);
    }


}
