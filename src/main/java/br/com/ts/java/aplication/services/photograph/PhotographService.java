package br.com.ts.java.aplication.services.photograph;

import br.com.ts.java.aplication.models.Photograph;
import br.com.ts.java.aplication.repositories.PhotographRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotographService implements IPhotographService{
    @Autowired
    private PhotographRepository repository;

    @Override
    public void save(Photograph photograph) {
        repository.saveAndFlush(photograph);
    }

    @Override
    public Photograph getOne(String key) {
        return repository.findByKey(key);
    }

    @Override
    public List<Photograph> findAll() {
        return repository.findAll();
    }
}
