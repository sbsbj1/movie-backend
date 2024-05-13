package com.movies.projectmovies.service;

import com.movies.projectmovies.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movies.projectmovies.repository.MoviesRepository;

import java.util.List;

@Service
public class MoviesService {

    @Autowired
    private MoviesRepository moviesRepository;

    public List<Movies> findAll() {
        return moviesRepository.findAll();
    }
}
