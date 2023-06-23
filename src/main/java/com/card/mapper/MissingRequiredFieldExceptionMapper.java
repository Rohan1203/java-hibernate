package com.card.mapper;

import com.card.exception.ErrorMessages;
import com.card.exception.MissingRequiredFieldException;
import com.card.model.error.ErrorMessage;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

/**
 * @author rohan.das on 20/06/23
 * @project system-integration
 */

@Provider
public class MissingRequiredFieldExceptionMapper  implements ExceptionMapper<MissingRequiredFieldException> {

    @Override
    public Response toResponse(MissingRequiredFieldException obj) {
        ErrorMessage errorMessage = new ErrorMessage(obj.getMessage(),
                ErrorMessages.MISSING_REQUIRED_FIELD.name(),
                "http://localhost:8080/app");
        return Response.status(Response.Status.BAD_REQUEST).entity(errorMessage).build();
    }
}
