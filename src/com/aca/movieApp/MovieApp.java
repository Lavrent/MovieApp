package com.aca.movieApp;

import com.aca.movieApp.movie.Movie;
import com.aca.movieApp.movie.MovieMaker;
import com.aca.movieApp.user.Admin;
import com.aca.movieApp.user.User;
import com.aca.movieApp.user.UserMaker;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovieApp {
    public static void runProgram() {
        UserMaker userMaker = new UserMaker();
        List<User> reg_users = userMaker.getRegisteredUsers();
        userMaker.printUsers(reg_users);
        User user = reg_users.get(new Random().nextInt(reg_users.size()));
        Admin admin = new Admin(user.getUserName(), user.getPassword());
        System.out.println(admin.toString());
        MovieMaker movieMaker = new MovieMaker();
        List<Movie> movies = movieMaker.createMovies();
        movieMaker.searchByTitle("Avengers", movies);
        System.out.println();
        movieMaker.searchByDate(LocalDate.of(2019, Month.APRIL, 10), LocalDate.now(), movies);
    }
}