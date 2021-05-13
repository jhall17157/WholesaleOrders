package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.exception.ResourceNotFoundException;
import edu.wctc.wholesale.repo.CustomerRepository;
import edu.wctc.wholesale.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer getCustomer(int id){
        List<Customer> list = new ArrayList<>();
         customerRepository.findById(id);
         return (Customer) list;
    }

}
