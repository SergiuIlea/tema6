package org.fasttrack.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "studios")
public class Studio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studio_id")
    private Integer studioId;
    private String name;
    private String adress;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Movie> movies;

    public Studio(Integer id, String name, String adress, List<Movie> movies) {
        this.studioId = id;
        this.name = name;
        this.adress = adress;
        this.movies = movies;
    }

    public Studio(String name, String adress, List<Movie> movies) {
        this.name = name;
        this.adress = adress;
        this.movies = movies;
    }

    public Studio() {
    }

    public Integer getStudioId() {
        return studioId;
    }

    public void setStudioId(Integer studioId) {
        this.studioId = studioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
