package org.fasttrack.controller;

import org.fasttrack.model.Movie;
import org.fasttrack.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieController {
    @Autowired
    private MovieService service;

    @GetMapping
    public List<Movie> getAllMovies(){
        return service.getAll();
    }

    @PostMapping
    public int saveMovies(@RequestBody Movie movie){
        return service.addMovie(movie);
    }
}
