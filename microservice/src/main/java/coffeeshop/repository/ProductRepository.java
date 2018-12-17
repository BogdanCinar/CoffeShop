package coffeeshop.repository;

import coffeeshop.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bci on 12/11/18 at 9:55 AM
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
