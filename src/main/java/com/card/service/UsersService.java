package com.card.service;

import com.card.dto.auth.UserDto;

/**
 * @author rohan.das on 20/06/23
 * @project system-integration
 */
public interface UsersService {
    UserDto createUser(UserDto user);
}
