package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Order;
import edu.wctc.wholesale.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public  class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order getOrder() {
        List<Order> list = new ArrayList<>();
        orderRepository.findAll().forEach(list::add);
        return (Order) list;
    }




}
