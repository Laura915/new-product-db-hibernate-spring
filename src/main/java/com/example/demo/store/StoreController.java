package com.example.demo.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    @Autowired
    ProductEntityCrudRepository productEntityCrudRepository;


    @PostMapping(path = "/createProduct")
    void createProduct(@RequestBody ProductEntity product) {
        productEntityCrudRepository.save(product);
    }


    @GetMapping(path = "/home")
    String home() {

        return "Hi home";
    }

}
