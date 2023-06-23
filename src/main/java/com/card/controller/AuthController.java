package com.card.controller;

import com.card.dto.auth.UserDto;
import com.card.service.UsersService;
import com.card.service.UsersServiceImpl;
import com.card.model.auth.CreateUserRequestModel;
import com.card.model.auth.UserProfileRest;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.BeanUtils;


@Path("/users")
public class AuthController {
	@POST
	@Path("/create")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes(MediaType.APPLICATION_JSON)
	public UserProfileRest createUser(CreateUserRequestModel requestObject) {
		UserProfileRest returnValue = new UserProfileRest();

		// prepare user dto
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(requestObject, userDto);

		//create new user
		UsersService userService = new UsersServiceImpl();
		UserDto createdUserProfile =  userService.createUser(userDto);

		BeanUtils.copyProperties(createdUserProfile, returnValue);
		// prepare response
		return returnValue;
	}

}
