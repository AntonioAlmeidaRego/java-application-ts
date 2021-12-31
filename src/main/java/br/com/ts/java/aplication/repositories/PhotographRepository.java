package br.com.ts.java.aplication.repositories;

import br.com.ts.java.aplication.models.Photograph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotographRepository extends JpaRepository<Photograph, Long> {
    Photograph findByKey(String key);
}