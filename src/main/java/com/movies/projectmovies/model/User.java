package com.movies.projectmovies.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table (name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;


    @Column(nullable = false, unique = true)               //considerar proteger esto con Bcrypt
    private String password;

    @Transient
    @NotNull
    private String matchingpassword;



    @Column(nullable = false, unique = true)
    @Email
    private String email;

    //private String country;

    @Min(value = 0)
    @Max(value = 10000)
    private long points;

}
