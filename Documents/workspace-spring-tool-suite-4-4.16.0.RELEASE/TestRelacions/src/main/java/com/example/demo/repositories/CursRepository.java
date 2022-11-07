package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Curs;

public interface CursRepository extends CrudRepository<Curs, Long> {
    public List<Curs> findAll();
}
