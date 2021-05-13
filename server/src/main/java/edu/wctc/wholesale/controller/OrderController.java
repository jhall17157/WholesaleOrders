package edu.wctc.wholesale.controller;

import edu.wctc.wholesale.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @RequestMapping("/")
    public String showOrderPage(Model model) {
        model.addAttribute("orderList", orderRepository.findAll());
        return "index";
    }
}
