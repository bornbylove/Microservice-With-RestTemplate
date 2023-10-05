package com.ebenz.userservice.service;

import com.ebenz.userservice.dto.ResponseDto;
import com.ebenz.userservice.entity.User;

public interface UserService {

    User saveUser(User user);

    ResponseDto getUser (Long userId);
}
