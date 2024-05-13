package com.movies.projectmovies.repository;


import com.movies.projectmovies.model.PlatformMovies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformMoviesRepository extends JpaRepository<PlatformMovies, Long> {
}
