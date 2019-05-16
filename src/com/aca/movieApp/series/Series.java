package com.aca.movieApp.series;

import com.aca.movieApp.movie.Genre;
import com.aca.movieApp.movie.Movie;
import com.aca.movieApp.movie.movieworkers.MovieRelatedPerson;

import java.time.LocalDate;
import java.util.List;

public class Series extends Movie {
   private int season;
   private int episode;
    public Series(String title, String description, double average_rating, LocalDate premierDate,
                  Genre genre, List<MovieRelatedPerson> artists,int season,int episode) {
        super(title, description, average_rating, premierDate, genre, artists);
        this.season = season;
        this.episode = episode;
    }

    @Override
    public String toString() {
        return super.toString()
                + "season - " + season
                + "episode - " + episode;
    }
}
