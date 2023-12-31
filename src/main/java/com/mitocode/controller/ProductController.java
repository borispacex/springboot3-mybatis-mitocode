package com.mitocode.controller;

import com.mitocode.model.Product;
import com.mitocode.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping
    public List<Product> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PostMapping
    public int save(@RequestBody Product product) {
        return service.save(product);
    }

    @PutMapping
    public int update(@RequestBody Product product) {
        return service.update(product);
    }

    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable("id") int id) {
        return service.deleteById(id);
    }

}
