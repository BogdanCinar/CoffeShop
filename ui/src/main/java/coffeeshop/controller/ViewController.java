package coffeeshop.controller;

import coffeeshop.entity.Order;
import coffeeshop.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class ViewController extends BaseViewController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/order")
    public String orders(Model model) {
        Map<String, Long> queryParams = new HashMap<>();
        queryParams.put("id", 1L);

        ResponseEntity<List<Product>> response =
                restTemplate.exchange("http://localhost:8091/product", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Product>>(){});
        List<Product> products = response.getBody();

        System.out.println(products);

        model.addAttribute("orders", new ArrayList());
        model.addAttribute("order", new Order());
        model.addAttribute("products", products);

        return "orders";
    }
}