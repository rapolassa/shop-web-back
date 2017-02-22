package com.swedbank.itacademy.shopwebback.repository;

import com.swedbank.itacademy.shopwebback.bean.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends CrudRepository<Category, Long> {
}
