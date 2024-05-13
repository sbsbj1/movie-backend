package com.movies.projectmovies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movies.projectmovies.repository.PlatformRepository;

@Service
public class PlatformService {


    @Autowired
    private PlatformRepository platformRepository;
}
