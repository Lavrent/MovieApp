package com.aca.movieApp.movie;

import java.util.ArrayList;
import java.util.List;

public class MovieMaker {
    private List<Movie> movies = new ArrayList<>();

    public void createMovies() {
        Movie movie = new Movie("Avengers", "film with high quality spec effects", 8.0, "05-05-2019",
                "fantasy", "Scarlett Johansson", "Russo Brothers", "someone");
        movies.add(movie);
    }

    public void searchByTitle(String title) {
        for (Movie movie:movies) {
            if (title.equals(movie.getTitle()))
                System.out.println(movie.toString());
        }
    }
}
