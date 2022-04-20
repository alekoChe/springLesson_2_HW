package ru.gdAleko.springLesson_2.homeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component()
public class ProductService { ////////////////////

    @Autowired
    private Repository repository;

    @Autowired
    private Cart cart;

    public Product getProduct(Long id){
       return repository.findById(id);
    }

    public void addProductInCart(Long id, List<Product> cartLList) {
        cartLList.add(repository.findById(id));
    }

}
