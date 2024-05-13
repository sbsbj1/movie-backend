package com.movies.projectmovies.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;


@Entity
@Data
@Table(name = "movies_user")
public class MoviesUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movies movie;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



}
