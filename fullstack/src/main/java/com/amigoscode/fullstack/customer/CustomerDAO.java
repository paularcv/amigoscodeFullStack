package com.amigoscode.fullstack.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDAO {

    List<Customer> selectAllCustomers();

    Optional<Customer> selectCustomerById(Integer id);
}
