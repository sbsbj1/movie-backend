package com.movies.projectmovies.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "community_award")
public class CommunityAward implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private int pointsUsed;


    @ManyToOne
    @JoinColumn(name = "id_user")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "id_movie")
    private Movies movieId;




}
