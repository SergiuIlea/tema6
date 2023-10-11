package org.fasttrack.model;

import jakarta.persistence.*;

@Entity
@Table(name = "movieRatings")
public class MovieRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movieRating_id")
    private Integer movieRatingId;
    private int rating;
    private String agency;
    @OneToOne(mappedBy = "movieRating")
    private Movie ratingOf;

    public MovieRating(Integer id, int rating, String agency, Movie ratingOf) {
        this.movieRatingId = id;
        this.rating = rating;
        this.agency = agency;
        this.ratingOf = ratingOf;
    }

    public MovieRating(int rating, String agency, Movie ratingOf) {
        this.rating = rating;
        this.agency = agency;
        this.ratingOf = ratingOf;
    }

    public MovieRating() {
    }

    public Integer getMovieRatingId() {
        return movieRatingId;
    }

    public void setMovieRatingId(Integer movieRatingId) {
        this.movieRatingId = movieRatingId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Movie getMovieToBeRated() {
        return ratingOf;
    }

    public void setMovieToBeRated(Movie movieToBeRated) {
        this.ratingOf = movieToBeRated;
    }

    public Movie getRatingOf() {
        return ratingOf;
    }

    public void setRatingOf(Movie ratingOf) {
        this.ratingOf = ratingOf;
    }
}
