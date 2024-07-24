package com.example.ecom.user;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<UserDto> getAllUsers() {
        Iterable<User> users = userRepository.findAll();
        return  StreamSupport.stream(users.spliterator(), false)
                .map(this::convertUserToUserDto)
                .collect(Collectors.toList());
    }

    private UserDto convertUserToUserDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }
}
