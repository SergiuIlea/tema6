package org.fasttrack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "actors")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id")
    private Integer actorId;
    private String name;
    private int birthYear;

    @ManyToMany(mappedBy = "actors")
    @JsonIgnore
    private List<Movie> movies = new ArrayList<>();

    public Actor(Integer id, String name, int birthYear, List<Movie> movies) {
        this.actorId = id;
        this.name = name;
        this.birthYear = birthYear;
        this.movies = movies;
    }

    public Actor(String name, int birthYear, List<Movie> movies) {
        this.name = name;
        this.birthYear = birthYear;
        this.movies = movies;
    }

    public Actor() {
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public void addMovie(Movie movie){
        if(movies == null){
            movies = new ArrayList<>();
        }
        this.movies.add(movie);
    }
}
