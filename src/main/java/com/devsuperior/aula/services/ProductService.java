package com.devsuperior.aula.services;

import com.devsuperior.aula.dto.ProductDTO;
import com.devsuperior.aula.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public ProductDTO insert(ProductDTO dto) {

    }
}
