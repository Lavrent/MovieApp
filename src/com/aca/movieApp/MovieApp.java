package com.aca.movieApp;

import com.aca.movieApp.movie.Movie;
import com.aca.movieApp.movie.MovieMaker;
import com.aca.movieApp.user.Admin;
import com.aca.movieApp.user.User;
import com.aca.movieApp.user.UserMaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovieApp {

    public static void main(String[] args) {
        UserMaker userMaker = new UserMaker();
        List<User> reg_users = userMaker.getRegisteredUsers();
        userMaker.printUsers(reg_users);
        User admin = new Admin("aaa", "bbb");
        admin = reg_users.get(new Random().nextInt(reg_users.size()));

        MovieMaker movieMaker = new MovieMaker();
        movieMaker.searchByTitle("aaa");
    }
}