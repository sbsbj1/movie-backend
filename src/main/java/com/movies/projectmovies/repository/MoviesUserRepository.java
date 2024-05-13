package com.movies.projectmovies.repository;


import com.movies.projectmovies.model.MoviesUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesUserRepository extends JpaRepository<MoviesUser, Long> {
}
