package com.card.service;

import com.card.dto.auth.UserDto;
import com.card.utils.UserUtils;

/**
 * @author rohan.das on 20/06/23
 * @project system-integration
 */
public class UsersServiceImpl implements UsersService{
    UserUtils userUtils = new UserUtils();

    @Override
    public UserDto createUser(UserDto user) {
        UserDto returnValue = new UserDto();
        // validate th required fields
        userUtils.validateRequiredFields(user);

        // check if the user already exists
        // create an entity object
        // generate secure public userid
        // generate salt
        // generate secure password
        // record data into the db
        // return back the user profile


        return returnValue;
    }
}
