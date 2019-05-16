package com.aca.movieApp.movie;

import com.aca.movieApp.movie.movieworkers.Actor;
import com.aca.movieApp.movie.movieworkers.Director;
import com.aca.movieApp.movie.movieworkers.MovieRelatedPerson;
import com.aca.movieApp.movie.movieworkers.Writer;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class MovieMaker {

    public List<Movie> createMovies() {
        List<Movie> movies = new ArrayList<>();
        List<MovieRelatedPerson> personList = new ArrayList<>();
        personList.add(new Actor("Jackie Chan", "actor"));
        personList.add(new Director("cameron", "director"));
        personList.add(new Writer("Steven King", "writer"));
        Movie movie = new Movie("Avengers", "film with high quality spec effects", 8.0, LocalDate.of(2019, Month.APRIL, 28),
                Genre.Fantasy, personList);
        movies.add(movie);
        return movies;
    }

    public void searchByTitle(String title, List<Movie> movies) {
        for (Movie movie : movies) {
            if (title.equals(movie.getTitle()))
                System.out.println(movie.toString());
            else
                System.out.println("no movie with  title " + title + " in movie list");
        }
    }

    public void searchByDate(LocalDate fromDate, LocalDate toDate, List<Movie> movies) {

        List<Movie> resultedMovies = new ArrayList<>();
        for (Movie movie : movies) {
            LocalDate movie_date = movie.getPremierDate();
            if ((movie_date.isAfter(fromDate) || movie_date.isEqual(fromDate))
                    && (movie_date.isBefore(toDate) || movie_date.isEqual(toDate)))
                resultedMovies.add(movie);
        }
        if (resultedMovies.size() > 0) {
            System.out.println("here are the movies released from date " + fromDate + " to date " + toDate);
            for (Movie movie: resultedMovies)
                System.out.println(movie);
        }else
            System.out.println("there are no movies matching specified date filter");
    }
}