package coffeeshop.repository;

import coffeeshop.domain.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by bci on 12/10/18 at 8:26 PM
 */
public interface OrderRepository extends CrudRepository<Order, Long> {
}
