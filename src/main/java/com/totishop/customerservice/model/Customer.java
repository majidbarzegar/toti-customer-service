package com.totishop.customerservice.model;

import com.totishop.commonmodel.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : MajidBarzegar(majidbarzegar.a@gmail.com)
 */

@Entity
@Table(name = "TBL_CUSTOMER")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "CUSTOMER_SEQ", allocationSize = 1)
@Getter
@Setter
public class Customer extends BaseEntity<Long> {
    private String name;
    private String family;
    private String email;
    private String password;
}
