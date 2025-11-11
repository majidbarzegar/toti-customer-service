package com.totishop.customerservice.repository;

import com.totishop.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : MajidBarzegar(majidbarzegar.a@gmail.com)
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
