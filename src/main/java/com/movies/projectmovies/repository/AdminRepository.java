package com.movies.projectmovies.repository;

import com.movies.projectmovies.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository <Admin, Long> {
}
