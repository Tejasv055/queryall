package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cart extends Model {
    @Column(name = "name")
    private String name;
    @OneToMany
    @JsonIgnoreProperties("cart")
    Set<Product> productSet;
    Cart(){
        super();
    }
    public Cart(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

}
