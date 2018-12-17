package coffeeshop.controller;


import coffeeshop.entity.Product;
import coffeeshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bci on 12/11/18 at 9:56 AM
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json",path="/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Long saveProduct(@RequestBody Product product) {
        productService.saveOrUpdate(product);
        return product.getId();
    }
}
