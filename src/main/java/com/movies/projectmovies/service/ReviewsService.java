package com.movies.projectmovies.service;


import com.movies.projectmovies.model.Reviews;
import com.movies.projectmovies.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movies.projectmovies.repository.ReviewRepository;

import java.util.List;

@Service
public class ReviewsService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Reviews> findAll() {
        return reviewRepository.findAll();
    }


}
