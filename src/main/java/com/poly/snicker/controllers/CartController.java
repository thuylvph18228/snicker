package com.poly.snicker.controllers;

import com.poly.snicker.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {
    @Autowired
    ProductService productService;

    @GetMapping("/addPro")
    public String addPro(){
        return "";
    }
}
