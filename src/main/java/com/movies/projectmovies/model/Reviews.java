package com.movies.projectmovies.model;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "reviews")
public class Reviews implements Serializable {

    @Id
    private Long id;


    private String content;


    private double userRating;

    private boolean heart;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "id_movie")
    private Movies movieId;
}
