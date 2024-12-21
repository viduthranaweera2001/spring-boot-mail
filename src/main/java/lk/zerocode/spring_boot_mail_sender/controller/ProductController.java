package lk.zerocode.spring_boot_mail_sender.controller;

import lk.zerocode.spring_boot_mail_sender.model.Product;
import lk.zerocode.spring_boot_mail_sender.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
}
