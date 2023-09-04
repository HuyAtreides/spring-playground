package com.example.springplayground.services;

import com.example.springplayground.models.Film;
import com.example.springplayground.repo.FilmRepo;
import java.time.Instant;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FilmService {

    @Autowired
    private FilmRepo repo;
    @Autowired
    private FilmService1 filmService1;

    @Transactional
    public void addFilm() {
        repo.save(
                new Film(
                        "Severance",
                        Instant.now(),
                        "DanErickson"
                )
        );
    }

    @Transactional
    public void update(Long id, String name) {
        repo.updateFilmName(id, name);
        filmService1.update(id, name);
    }
}
