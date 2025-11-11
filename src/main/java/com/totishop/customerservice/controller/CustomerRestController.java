package com.totishop.customerservice.controller;

import com.totishop.commondto.ResponseDto;
import com.totishop.customerservice.dto.CustomerDto;
import com.totishop.customerservice.model.Customer;
import com.totishop.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : MajidBarzegar(majidbarzegar.a@gmail.com)
 */
@RestController
@RequiredArgsConstructor
public class CustomerRestController {

    private final CustomerService customerService;

    @PostMapping
    public ResponseDto<CustomerDto> saveCustomer() {
        Customer save = customerService.save(new Customer());
        return ResponseDto.success(new CustomerDto(), "");
    }

}
