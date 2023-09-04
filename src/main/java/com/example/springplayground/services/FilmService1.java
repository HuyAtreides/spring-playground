package com.example.springplayground.services;

import com.example.springplayground.repo.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FilmService1 {
    @Autowired
    private FilmRepo repo;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void update(Long id, String name) {
        repo.updateFilmDirector(id, name);
    }
}
