package com.example.springplayground.controller;

import com.example.springplayground.services.FilmService;
import com.example.springplayground.services.FilmService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

@RestController
@RequestMapping("film")

public class FilmController {

    @Autowired
    private FilmService filmService;

    @Autowired
    private FilmService1 filmService1;

    @GetMapping("{id}")
    public String get(@PathVariable Long id) {
        return null;
    }

    @GetMapping("add")
    public void add() {
        filmService.addFilm();
    }

    @GetMapping("update/{id}/{name}")
    public void update(@PathVariable long id, @PathVariable String name) {
        filmService.update(id, name);
    }
}
