package com.mitocode.service;

import com.mitocode.mapper.ProductMapper;
import com.mitocode.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductMapper mapper;

    /* public ProductServiceImpl(ProductMapper mapper) {
        this.mapper = mapper;
    } */

    @Override
    public List<Product> findAll() {
        return mapper.findAll();
    }

    @Override
    public Product findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public int deleteById(int id) {
        return mapper.deleteById(id);
    }

    @Override
    public int save(Product item) {
        return mapper.save(item);
    }

    @Override
    public int update(Product item) {
        return mapper.update(item);
    }

}
