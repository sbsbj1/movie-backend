package com.movies.projectmovies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movies.projectmovies.repository.CommunityAwardRepository;

@Service
public class CommunityAwardService {

    @Autowired
    private CommunityAwardRepository communityAwardRepository;
}
