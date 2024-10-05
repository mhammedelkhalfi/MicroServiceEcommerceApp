package org.sid.ecommerce.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(String id,
                              @NotNull(message=" Customer Firstname is required")
                              String firstname,
                              @NotNull(message=" Customer Lastname is required")
                              String lastname,
                              @NotNull(message=" Customer email is required")
                              @Email(message="Customer Email is not valid email addresses")
                              String email,
                              Address address) {

}
