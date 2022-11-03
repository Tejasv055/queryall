package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Seller extends Model {
    @Column(name = "name")
    private String name;
    @ManyToMany
    @JsonIgnoreProperties("sellerSet")
    @JoinTable(name="product_seller",
            inverseJoinColumns = @JoinColumn(name = "product_id"),
            joinColumns = @JoinColumn(name = "seller_id"))
    Set<Product> productSet;
    Seller(){
        super();
    }
    public Seller(String name) {
        this();
        this.name = name;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }


    public String getName() {
        return name;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }
}
