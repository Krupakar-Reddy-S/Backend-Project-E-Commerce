package org.example.ecommerce.services;

import org.example.ecommerce.models.Order;
import org.example.ecommerce.models.Customer;
import org.example.ecommerce.models.OrderStatus;

import java.util.List;

public interface CustomerService {
    Customer getCustomerById(Long id);
    List<Customer> getAllCustomers();
    Customer createCustomer(Customer customer);
    void deleteCustomer(Long id);
    List<Order> getCustomerOrders(Long id);
}
