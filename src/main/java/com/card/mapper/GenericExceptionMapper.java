package com.card.mapper;

import com.card.exception.ErrorMessages;
import com.card.model.error.ErrorMessage;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

/**
 * @author rohan.das on 23/06/23
 * @project system-integration
 */

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable exception) {
        ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(),
                ErrorMessages.INTERNAL_SERVER_ERROR.name(),
                "http://localhost:8080/app");
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
    }
}
