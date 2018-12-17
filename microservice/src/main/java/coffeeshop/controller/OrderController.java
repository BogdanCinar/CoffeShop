package coffeeshop.controller;


import coffeeshop.entity.Order;
import coffeeshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bci on 12/10/18 at 8:25 PM
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(method = RequestMethod.POST)
    public Long saveOrder(@RequestBody Order order) {
        orderService.saveOrUpdate(order);
        return order.getId();
    }


}
