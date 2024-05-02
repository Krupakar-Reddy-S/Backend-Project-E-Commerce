package org.example.ecommerce.controllers;

import org.example.ecommerce.models.Customer;
import org.example.ecommerce.models.Order;
import org.example.ecommerce.services.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") Long id) {
        logger.info("Getting customer by id: " + id);
        return customerService.getCustomerById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        logger.info("Getting all customers...");
        return customerService.getAllCustomers();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        logger.info("Creating customer: " + customer);
        return customerService.createCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Long id) {
        logger.info("Deleting customer by id: " + id);
        customerService.deleteCustomer(id);
    }

    @GetMapping("/{id}/orders")
    public List<Order> getCustomerOrders(@PathVariable("id") Long id) {
        logger.info("Getting customer orders by id: " + id);
        return customerService.getCustomerOrders(id);
    }
}
