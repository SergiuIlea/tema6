package org.fasttrack;

import org.fasttrack.model.*;
import org.fasttrack.repository.ActorRepository;
import org.fasttrack.repository.MovieRepository;
import org.fasttrack.repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner atStartup(MovieRepository movieRepository,
                                ActorRepository actorRepository,
                                ReviewRepository reviewRepository){
        return args -> {
            Actor a1 = new Actor("Chris Pratt", 1979, null);
            Actor a2 = new Actor("Bryce Dallas Howard", 1981, null);
            Actor a3 = new Actor("James Gunn", 1966, null);
            Actor a4 = new Actor("Andrei Selaru", 2001, null);
            Actor a5 = new Actor("Matei Dima", 1987, null);

            actorRepository.save(a1);
            actorRepository.save(a2);
            actorRepository.save(a3);
            actorRepository.save(a4);
            actorRepository.save(a5);

            MovieRating mR1 = new MovieRating(3,"imdb", null);
            MovieRating mR2 = new MovieRating(8,"imdb", null);
            MovieRating mR3 = new MovieRating(5,"imdb", null);

            Review r1 = new Review("pozitiv", "reviewer", null);
            Review r2 = new Review("negativ", "reviewer", null);
            reviewRepository.save(r1);
            reviewRepository.save(r1);


            Studio s1 = new Studio("Universal", "Hollywood", null);
            Studio s2 = new Studio("Disney", "Hollywood", null);
            Studio s3 = new Studio("MediaPro", "Bucuresti", null);

            Movie m1 = new Movie("Jurassic World", 2015, mR3, List.of(r1), s1, List.of(a1, a2));
            a1.addMovie(m1);
            a2.addMovie(m1);
            mR3.setMovieToBeRated(m1);
            r1.setReviewOf(m1);
            s1.addMovie(m1);

            Movie m2 = new Movie("Guardians of the galaxy", 2014, mR2, List.of(r1), s2, List.of(a1, a3));
            a1.addMovie(m2);
            a3.addMovie(m2);
            mR2.setMovieToBeRated(m2);
            r1.setReviewOf(m2);
            s2.addMovie(m2);

            Movie m3 = new Movie("5Gang", 2019, mR1, List.of(r2), s3, List.of(a4, a5));
            a4.addMovie(m3);
            a5.addMovie(m3);
            mR1.setMovieToBeRated(m3);
            r2.setReviewOf(m3);
            s3.addMovie(m3);

            movieRepository.save(m1);
            movieRepository.save(m2);
            movieRepository.save(m3);

        };
    }
}
