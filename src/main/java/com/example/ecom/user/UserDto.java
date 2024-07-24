package com.example.ecom.user;

import com.example.ecom.role.Role;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private boolean accountLocked;
    private boolean enabled;
    private List<Role> roles;
}
