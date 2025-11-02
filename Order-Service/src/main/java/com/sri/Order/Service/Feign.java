package com.sri.Order.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Objects;

@FeignClient("PRODUCT-SERVICE")
public interface Feign {
    @GetMapping("/products/getproducts")
    public List<Product> getProducts();
}
