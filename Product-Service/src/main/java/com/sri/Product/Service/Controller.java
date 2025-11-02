package com.sri.Product.Service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class Controller {

    @GetMapping("/test")
    public String welcome(){
        return "heloo welcome...";
    }

    @GetMapping("/getproducts")
    public List<Product> getProducts(){
        List<Product> products=new ArrayList<>();
        products.add(new Product(1,"oneplus",345,"mobile","mdm"));
        products.add(new Product(1,"LG",898,"TV","mdm"));
        products.add(new Product(1,"samsung",500,"appliance","lrg"));
        products.add(new Product(1,"acer",600,"laptop","sm"));
        return products;
    }
}
