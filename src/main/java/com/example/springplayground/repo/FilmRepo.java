package com.example.springplayground.repo;

import com.example.springplayground.models.Film;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContextType;
import org.hibernate.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.SessionScope;

@Repository
public class FilmRepo {

    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;


    public long save(Film film) {
        entityManager.persist(film);
        System.out.println("After insert");
        System.out.println(film.toString());
        return film.getId();
    }

    public void updateFilmName(long id, String name) {
        Film film = entityManager.find(Film.class, id);
        entityManager.createQuery("select film from Film film where film.id = 9", Film.class).getSingleResult();

        film.setName(name);
        System.out.println("After update");
        System.out.println(film.toString());
    }

    public void updateFilmDirector(long id, String director) {
        Film film = entityManager.find(Film.class, id);

        film.setDirector(director);
        System.out.println("After update Director");
        System.out.println(film.toString());
    }
}
