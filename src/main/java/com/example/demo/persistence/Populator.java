package com.example.demo.persistence;

import com.example.demo.domain.Cart;
import com.example.demo.domain.Product;
import com.example.demo.domain.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class Populator implements CommandLineRunner {
    @Autowired
    CartRepository cartRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    SellerRepository sellerRepository;

    @Override
    public void run(String... args) throws Exception {


        final var iphone = new Product("Iphone");

        final var samsung = new Product("Samsung");

        final var redmi = new Product("redmi");
        final var cart = new Cart("cart");

        final var seller = new Seller("seller1");

        final var seller2 = new Seller("seller2");

        cart.setProductSet(Set.of(iphone, samsung, redmi));

        seller.setProductSet(Set.of(iphone, samsung));
        seller2.setProductSet(Set.of(redmi));
        productRepository.saveAll(Set.of(redmi, iphone, samsung));
        sellerRepository.saveAll(Set.of(seller, seller2));
        cartRepository.save(cart);


    }
}
