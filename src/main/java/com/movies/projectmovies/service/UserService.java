package com.movies.projectmovies.service;


import com.movies.projectmovies.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.movies.projectmovies.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public <S extends User> S save(S entity) {
        return userRepository.save(entity);
    }


    public Optional<User> findById(Long aLong) {
        return userRepository.findById(aLong);
    }




    public List<User> findAll() {
        return userRepository.findAll();
    }


    public void deleteById(Long aLong) {
        userRepository.deleteById(aLong);
    }


    public void delete(User entity) {
        userRepository.delete(entity);
    }

    public List<User> findAll(Sort sort) {
        return userRepository.findAll(sort);
    }

    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}
