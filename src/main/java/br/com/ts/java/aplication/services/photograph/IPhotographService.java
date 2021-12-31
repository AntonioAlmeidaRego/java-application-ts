package br.com.ts.java.aplication.services.photograph;

import br.com.ts.java.aplication.models.Photograph;

import java.util.List;

public interface IPhotographService {
    void save(Photograph photograph);
    Photograph getOne(String key);
    List<Photograph> findAll();
}
