package com.swedbank.itacademy.shopwebback.controller;

import com.swedbank.itacademy.shopwebback.bean.entity.Category;
import com.swedbank.itacademy.shopwebback.bean.entity.Products;
import com.swedbank.itacademy.shopwebback.repository.CategoriesRepository;
import com.swedbank.itacademy.shopwebback.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ShopController {

    @Autowired
    private CategoriesRepository categoriesRepository;


    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public Iterable<Category> getCategories() { // Get all available categories

        return categoriesRepository.findAll();
    }

    @RequestMapping(value = "/categories/new/{name}", method = RequestMethod.POST)
    public void addNewCategory(@PathVariable String name) {
        Category newCategory = new Category();
        newCategory.setName(name);
        categoriesRepository.save(newCategory);
    }


    @Autowired
    private ProductsRepository productsRepository;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public Iterable<Products> getProducts()
    {
        return productsRepository.findAll();
    }

    public Category getCategory(@PathVariable Long id) // Get category by id
    {
        return categoriesRepository.findOne(id);
    }


}
