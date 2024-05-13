package com.movies.projectmovies.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table (name = "admin")
public class Admin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)            //considerrar esto con Bcrypt
    private String password;

    @Column(nullable = false, unique = true)
    private String token;         //token se generara y sera unico, admin debera guardarlo porque es su identificacion

}
