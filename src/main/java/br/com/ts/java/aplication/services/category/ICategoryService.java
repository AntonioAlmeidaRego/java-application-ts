package br.com.ts.java.aplication.services.category;

import br.com.ts.java.aplication.models.Category;

import java.util.List;

public interface ICategoryService {
    void save(Category category);
    Category getOne(String key);
    List<Category> findAll();
}
