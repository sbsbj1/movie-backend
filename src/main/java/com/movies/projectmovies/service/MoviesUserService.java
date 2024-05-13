package com.movies.projectmovies.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movies.projectmovies.repository.MoviesUserRepository;

@Service
public class MoviesUserService {

    @Autowired
    private MoviesUserRepository moviesUserRepository;

}
