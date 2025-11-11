package com.totishop.customerservice.service;

import com.totishop.customerservice.model.Customer;
import com.totishop.customerservice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author : MajidBarzegar(majidbarzegar.a@gmail.com)
 */
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository repository;

    @Override
    public Customer save(Customer customer) {
        return repository.save(customer);
    }
}
