package com.aca.movieApp.movie;

import com.aca.movieApp.movie.movieworkers.Actor;
import com.aca.movieApp.movie.movieworkers.Director;
import com.aca.movieApp.movie.movieworkers.MovieRelatedPerson;
import com.aca.movieApp.movie.movieworkers.Writer;

import java.util.ArrayList;
import java.util.List;

public class MovieMaker {

    public List<Movie> createMovies() {
        List<Movie> movies = new ArrayList<>();
        List<MovieRelatedPerson> personList = new ArrayList<>();
        personList.add(new Actor("Jackie Chan", "actor"));
        personList.add(new Director("cameron", "director"));
        personList.add(new Writer("Steven King", "writer"));
        Movie movie = new Movie("Avengers", "film with high quality spec effects", 8.0, "05-05-2019",
                Genre.Fantasy, personList);
        movies.add(movie);
        return movies;
    }

    public void searchByTitle(String title, List<Movie> movies) {
        movies = createMovies();
        for (Movie movie : movies) {
            if (title.equals(movie.getTitle()))
                System.out.println(movie.toString());
            else
                System.out.println("no movie with  title " + title + " in movie list");
        }
    }
}