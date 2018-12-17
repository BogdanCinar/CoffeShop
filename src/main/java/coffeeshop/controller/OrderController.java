package coffeeshop.controller;

import coffeeshop.domain.Order;
import coffeeshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bci on 12/10/18 at 8:25 PM
 */
@Controller
@RequestMapping({"/orders","/"})
public class OrderController {


    @Autowired
    private OrderService orderService;

    @RequestMapping(method = RequestMethod.POST)
    public Long saveOrder(@RequestBody Order order) {
        orderService.saveOrUpdate(order);
        return order.getId();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getOrders(Model model) {

        model.addAttribute("orders",orderService.getOrders());

        return "orders";
    }




}
