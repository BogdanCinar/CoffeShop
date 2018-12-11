package coffeeshop.service;

import coffeeshop.domain.Order;
import coffeeshop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bci on 12/10/18 at 8:26 PM
 */
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void saveOrUpdate(Order order) {
        orderRepository.save(order);
    }
}
