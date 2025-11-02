package com.sri.Order.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {


    @Autowired
    Feign feign;

    @GetMapping("/getorders")
    public List<Product> getorders()
    {
      return feign.getProducts();
    }
}
