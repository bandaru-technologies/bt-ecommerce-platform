package com.bt.ecommerce.bt_product_service.controller;

import com.bt.ecommerce.bt_product_service.entity.Product;
import com.bt.ecommerce.bt_product_service.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

  private final ProductRepository repository;

  public ProductController(ProductRepository repository) {
    this.repository = repository;
  }

  @PostMapping
  public Product create(@RequestBody Product product) {
    return repository.save(product);
  }

  @GetMapping
  public List<Product> findAll() {
    return repository.findAll();
  }
}
