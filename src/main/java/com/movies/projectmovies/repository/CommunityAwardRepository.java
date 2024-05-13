package com.movies.projectmovies.repository;

import com.movies.projectmovies.model.CommunityAward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityAwardRepository extends JpaRepository<CommunityAward, Long> {
}
