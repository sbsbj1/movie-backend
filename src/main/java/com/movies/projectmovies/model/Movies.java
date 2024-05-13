package com.movies.projectmovies.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.Data;

import java.io.Serializable;
import java.time.Year;

@Entity
@Data
@Table(name = "movies")
public class Movies implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Year released_year;

    @Column(nullable = false)
    private long runtime;

    @DecimalMin(value = "1.0")
    @DecimalMax(value = "10.0")
    @Column(nullable = false)
    private double rating;

    @Column(nullable = false)
    private String overview;

    @Column(nullable = false)
    private String director;

    @ManyToOne
    @JoinColumn(name = "id_platform")
    private Platform platformId;

}
