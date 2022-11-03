package com.example.demo.persistence;

import com.example.demo.domain.Cart;
import com.example.demo.domain.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CartRepository extends ModelRepository<Cart>{
    @Query(nativeQuery = true,value = "SELECT Product.name FROM Cart INNER JOIN Product on Product.cart_id=cart.id WHERE cart.name= ?1")
    List<Product> findProductByCart(String name);
}
