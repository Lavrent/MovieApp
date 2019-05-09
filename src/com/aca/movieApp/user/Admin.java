package com.aca.movieApp.user;

import com.aca.movieApp.movie.Movie;

public class Admin extends User {
    public Admin(String userName, String password) {
        super(userName, password);
    }

    public void addTitle(Movie movie, String title){
        movie.setTitle(title);
    }
    public void addActor(Movie movie,String actor){
        movie.setActor(actor);
    }
    public void addDirector(Movie movie,String director){
        movie.setDirector(director);
    }
    public void addGenre(Movie movie,String genre){
        movie.setGenre(genre);
    }
    public void addDescription(Movie movie,String desc){
        movie.setDescription(desc);
    }
    public void addWriter(Movie movie,String writer){
        movie.setWriter(writer);
    }
    public void addPremierDate(Movie movie, String date){
        movie.setPremierDate(date);
    }
//addContent
}
