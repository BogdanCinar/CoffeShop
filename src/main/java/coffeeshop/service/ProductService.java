package coffeeshop.service;

import coffeeshop.domain.Product;
import coffeeshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
