package com.movies.projectmovies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movies.projectmovies.repository.PlatformMoviesRepository;

@Service
public class PlatformMoviesService {

    @Autowired
    private PlatformMoviesRepository platformMoviesRepository;
}
