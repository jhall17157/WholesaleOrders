package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.entity.Product;
import edu.wctc.wholesale.exception.ResourceNotFoundException;

public interface ProductService {
    Product getProduct(int id);
}
