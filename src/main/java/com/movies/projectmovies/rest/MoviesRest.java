package com.movies.projectmovies.rest;


import com.movies.projectmovies.model.Movies;
import com.movies.projectmovies.model.User;
import com.movies.projectmovies.repository.MoviesRepository;
import com.movies.projectmovies.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/movies/")
public class MoviesRest {

    @Autowired
    private MoviesService moviesService;

    @GetMapping
    private ResponseEntity<List<Movies>> getAllMovies(){
        return ResponseEntity.ok(moviesService.findAll());
    }


}
