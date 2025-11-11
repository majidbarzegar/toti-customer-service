package com.totishop.customerservice.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author : MajidBarzegar(majidbarzegar.a@gmail.com)
 */
@Getter
@Setter
public class CustomerDto {
    private Long id;
    private String name;
    private String family;
    private String email;
    private String password;
}
