package com.movies.projectmovies.rest;


import com.movies.projectmovies.model.Reviews;
import com.movies.projectmovies.service.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/reviews")
public class ReviewsRest {

    @Autowired
    private ReviewsService reviewsService;

    @GetMapping
    private ResponseEntity<List<Reviews>> findAllReviews(){
        return ResponseEntity.ok(reviewsService.findAll());
    }

}
