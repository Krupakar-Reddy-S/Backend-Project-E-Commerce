package org.example.ecommerce.services;

import org.example.ecommerce.models.Customer;
import org.example.ecommerce.repositories.CustomerRepository;
import org.example.ecommerce.exceptions.CustomerNotFoundException;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getCustomerById(Long id) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);

        if (optionalCustomer.isPresent()) {
            return optionalCustomer.get();
        } else {
            throw new CustomerNotFoundException(id, "Customer with id " + id + " not found!");
        }
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
