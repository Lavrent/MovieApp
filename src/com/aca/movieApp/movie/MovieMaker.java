package com.aca.movieApp.movie;

import java.util.ArrayList;
import java.util.List;

public class MovieMaker {

    public List<Movie> createMovies() {
        List<Movie> movies = new ArrayList<>();
        Movie movie = new Movie("Avengers", "film with high quality spec effects", 8.0, "05-05-2019",
                "fantasy", "Scarlett Johansson", "Russo Brothers", "someone");
        movies.add(movie);
        return movies;
    }

    public void searchByTitle(String title, List<Movie> movies) {
        movies = createMovies();
        for (Movie movie : movies) {
            if (title.equals(movie.getTitle()))
                System.out.println(movie.toString());
            else
                System.out.println("no movie with  title " + title +" in movie list");
        }
    }
}