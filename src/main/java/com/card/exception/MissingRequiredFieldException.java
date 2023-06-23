package com.card.exception;

/**
 * @author rohan.das on 20/06/23
 * @project system-integration
 */
public class MissingRequiredFieldException extends RuntimeException{

    private static final long serialVersionUID = -6394482064369740249L;
    
    public MissingRequiredFieldException(String message){
        super(message);
    }

}
