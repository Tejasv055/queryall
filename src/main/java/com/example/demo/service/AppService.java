package com.example.demo.service;

import com.example.demo.domain.Cart;
import com.example.demo.domain.Product;
import com.example.demo.domain.Seller;
import com.example.demo.persistence.CartRepository;
import com.example.demo.persistence.ProductRepository;
import com.example.demo.persistence.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    @Autowired
    CartRepository cartRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    SellerRepository sellerRepository;

    public List<Cart> get(){
        return cartRepository.findAll();
    }
    public List<Product> getSeller(){
        return productRepository.findAll();
    }
    public List<Product> getIt(String product){
        return cartRepository.findProductByCart(product);
    }
}
