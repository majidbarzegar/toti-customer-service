package com.totishop.customerservice.repository;

import com.totishop.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : MajidBarzegar(majidbarzegar.a@gmail.com)
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
