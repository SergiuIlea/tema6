package org.fasttrack.service;

import org.fasttrack.model.Movie;
import org.fasttrack.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    public List<Movie> getAll(){
        return  repository.findAll();
    }

    public int addMovie(Movie movie){
        Movie movieToBeAdded = repository.save(movie);
        return movieToBeAdded.getMovieId();
    }
}
