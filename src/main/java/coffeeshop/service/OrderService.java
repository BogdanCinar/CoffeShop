package coffeeshop.service;

import coffeeshop.domain.Order;
import coffeeshop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<Order> getOrders(){

        List<Order> orders= new ArrayList<>();
        orderRepository.findAll().forEach(orders::add);

        return  orders;
    }
}
