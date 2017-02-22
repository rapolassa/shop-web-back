package com.swedbank.itacademy.shopwebback.bean.entity;


import com.sun.xml.internal.ws.developer.UsesJAXBContext;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.soap.Text;

@Entity(name = "products")
public class Products {

    @Id
    @Column(name = "id")
    private Integer id;
    private String name;
    @Column(name = "description")
    private String  productDescription;

    public Integer getId() {
        return id;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
