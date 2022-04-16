package ru.gdAleko.springLesson_2.homeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class ProductService {

    @Autowired
    private Repository repository;

    public Product getProduct(Long id){
       return repository.findById(id);
    }

}
