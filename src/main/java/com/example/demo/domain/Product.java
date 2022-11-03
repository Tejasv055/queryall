package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product extends Model {
    @Column(name = "name")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("productSet")
    Cart cart;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("productSet")
    @JoinTable(name="product_seller",
            inverseJoinColumns = @JoinColumn(name = "seller_id"),
            joinColumns = @JoinColumn(name = "product_id"))
    Set<Seller> sellerSet;
    Product(){
        super();
    }
    public Product(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSellerSet(Set<Seller> sellerSet) {
        this.sellerSet = sellerSet;
    }

    public Set<Seller> getSellerSet() {
        return sellerSet;
    }

    public Cart getCart() {
        return cart;
    }

}
