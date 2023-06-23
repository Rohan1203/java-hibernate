package com.card.utils;

import com.card.dto.auth.UserDto;
import com.card.exception.ErrorMessages;
import com.card.exception.MissingRequiredFieldException;

/**
 * @author rohan.das on 20/06/23
 * @project system-integration
 */
public class UserUtils {
    public void validateRequiredFields(UserDto userDto) throws MissingRequiredFieldException {
        if (userDto.getFirstName() == null ||
            userDto.getFirstName().isEmpty() ||
            userDto.getLastName() == null ||
            userDto.getLastName().isEmpty() ||
            userDto.getEmail() == null ||
            userDto.getEmail().isEmpty() ||
            userDto.getPassword() == null ||
            userDto.getPassword().isEmpty() ) {
            throw new MissingRequiredFieldException(ErrorMessages.MISSING_REQUIRED_FIELD.getErrorMessage());
        }
    }
}
