package com.poly.snicker.controllers;

import com.poly.snicker.models.Products;
import com.poly.snicker.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/listProduct")
    public String listProduct(Model model){
        List<Products> listPro = productService.findAll();
        model.addAttribute("listPro", listPro);
        return "user/giay/product";
    }
}
