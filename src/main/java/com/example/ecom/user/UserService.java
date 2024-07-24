package com.example.ecom.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<UserDto> getAllUsers();
}
