package com.swedbank.itacademy.shopwebback.repository;

import com.swedbank.itacademy.shopwebback.bean.entity.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Integer> {
}
