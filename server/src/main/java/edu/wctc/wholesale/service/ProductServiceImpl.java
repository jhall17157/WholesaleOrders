package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.entity.Product;
import edu.wctc.wholesale.exception.ResourceNotFoundException;
import edu.wctc.wholesale.repo.CustomerRepository;
import edu.wctc.wholesale.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product getProduct(int id) {
        List<Product> list = new ArrayList<>();
        productRepository.findAll().forEach(list::add);
        return (Product) list;
    }
}
