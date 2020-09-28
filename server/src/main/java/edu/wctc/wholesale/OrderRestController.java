package edu.wctc.wholesale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderRestController {
    @Autowired
    private OrderRepository orderRepository;

    private OrderDto convert(Order order) {
        OrderDto dto = new OrderDto();
        dto.setCustomerName(order.getCustomer().getName());
        dto.setDate(order.getPurchaseDate());
        dto.setPoNumber(order.getPurchaseOrderNumber());
        dto.setProductName(order.getProduct().getName());
        dto.setShipped(order.getShippedDate());
        dto.setTerms(order.getTerms());
        dto.setProductName(order.getProduct().getName());
        dto.setTotal(order.getProduct().getCost());
        return dto;
    }

    @GetMapping("/api/orders")
    @CrossOrigin(origins = "http://localhost:63342")
    public List<OrderDto> getOrders() {
        Iterable<Order> orderList = orderRepository.findAll();
        List<OrderDto> dtoList = new ArrayList<>();

        for (Order order : orderList) {
            dtoList.add(convert(order));
        }

        return dtoList;
    }
}
