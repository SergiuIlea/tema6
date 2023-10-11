package org.fasttrack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Integer movieId;
    private String movieName;
    private int releaseYear;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "movie_rating_id")
    private MovieRating movieRating;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "reviewOf")
    private List<Review> reviews;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "studio_id")
    @JsonIgnore
    private Studio movieStudio;

    @ManyToMany
    @JoinTable(
            name = "actor_movie",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    private List<Actor> actors = new ArrayList<>();


    public Movie(Integer id, String movieName, int releaseYear, MovieRating movieRating, List<Review> reviews, Studio movieStudio, List<Actor> actors) {
        this.movieId = id;
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.movieRating = movieRating;
        this.reviews = reviews;
        this.movieStudio = movieStudio;
        this.actors = actors;
    }

    public Movie(String movieName, int releaseYear, MovieRating movieRating, List<Review> reviews, Studio movieStudio, List<Actor> actors) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.movieRating = movieRating;
        this.reviews = reviews;
        this.movieStudio = movieStudio;
        this.actors = actors;
    }

    public Movie() {
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public MovieRating getRatingOfThisMovie() {
        return movieRating;
    }

    public void setRatingOfThisMovie(MovieRating ratingOfThisMovie) {
        this.movieRating = ratingOfThisMovie;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public MovieRating getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(MovieRating movieRating) {
        this.movieRating = movieRating;
    }

    public Studio getMovieStudio() {
        return movieStudio;
    }

    public void setMovieStudio(Studio movieStudio) {
        this.movieStudio = movieStudio;
    }

    public void addReview(Review review){
        if(reviews == null){
            reviews = new ArrayList<>();
        }
        this.reviews.add(review);
    }

    public void addActor(Actor actor){
        if(actors == null){
            actors = new ArrayList<>();
        }
        this.actors.add(actor);
    }
}
