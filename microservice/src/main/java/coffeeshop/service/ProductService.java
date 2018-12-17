package coffeeshop.service;

import coffeeshop.entity.Product;
import coffeeshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bci on 12/11/18 at 9:56 AM
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void saveOrUpdate(Product product) {
        productRepository.save(product);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }
}
