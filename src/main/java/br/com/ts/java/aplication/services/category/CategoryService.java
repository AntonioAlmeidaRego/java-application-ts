package br.com.ts.java.aplication.services.category;

import br.com.ts.java.aplication.models.Category;
import br.com.ts.java.aplication.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private CategoryRepository repository;

    public void save(Category category){
        repository.saveAndFlush(category);
    }

    @Override
    public Category getOne(String key) {
        return repository.findByKey(key);
    }

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }
}
