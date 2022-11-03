package com.example.demo.controller;

import com.example.demo.domain.Cart;
import com.example.demo.domain.Product;
import com.example.demo.domain.Seller;
import com.example.demo.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class AppController {
    @Autowired
    AppService appService;
    @GetMapping
    public List<Cart> get(){
        return appService.get();
    }
    @GetMapping("/get")
    public List<Product> get1(){
        return appService.getSeller();
    }
    @GetMapping("/getw/{product}")
    public List<Product> gg(@PathVariable String product){
        return appService.getIt(product);
    }
}
