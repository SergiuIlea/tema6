package org.fasttrack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private int reviewId;
    private String text;
    private String reviewer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "movie_id")
    private Movie reviewOf;

    public Review(Integer id, String text, String reviewer, Movie reviewOf) {
        this.reviewId = id;
        this.text = text;
        this.reviewer = reviewer;
        this.reviewOf = reviewOf;
    }

    public Review(String text, String reviewer, Movie reviewOf) {
        this.text = text;
        this.reviewer = reviewer;
        this.reviewOf = reviewOf;
    }

    public Review() {
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public Movie getReviewOf() {
        return reviewOf;
    }

    public void setReviewOf(Movie reviewOf) {
        this.reviewOf = reviewOf;
    }


}
